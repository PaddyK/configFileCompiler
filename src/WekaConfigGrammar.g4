/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar WekaConfigGrammar;
@header{

}
configfile returns [Configfile f]
@init {
       $f = new Configfile(); }: 
              (e = element { $f.addElement($e.el); })+;

element returns [Element el]
@init {
       $el = new Element(); }: 
           STARTTAG SPACE* name = string    { el.setName($name.mstring); }
           (SPACE+ a = attributes           { el.addAttributes($a.attr); })? 
           SPACE* (l = longend          { el.addElement($l.le); }
                  | s = shortend)
           ;

attributes returns [Attribute attr]
@init {
       $attr = new Attribute();}: 
              (k1 = keyvalue    { $attr.setKeyValue($k1.kv); } 
               SPACE+ 
               a = attributes   { $attr.setAttribute($a.attr); })+
              | k2 = keyvalue   { $attr.setKeyValue($k2.kv); }
              ;

keyvalue returns [KeyValue kv]: 
            s = string EQ HK v = value HK {$kv = new KeyValue($s.mstring, $v.val); };

longend returns [Longend le]: 
           ENDTAG (e = element { $le.addElement($e.el)})+ 
           STARTTAG SLASH s = string { $le.addEndName($s.mstring); } ENDTAG;

shortend: 
            SLASH ENDTAG;

string returns [MyString mstring]
@init {
       $mstring = ""; }: 
                  (s = SMALLCHAR    { $mstring += $s.text; }
                  |c = CAPITALCHAR  { $mstring += $c.text; })
                  +;

value returns [Value val]: 
                (s = string     { $val = $s.mstring; }
                | n = numeric   { $val = $n.num; }
                | m = mixed     { $val = $m.mmixed; }
				| p = path		{ $val = $p.p:}
                );

numeric returns [MyNumeric num]
@init {
	$num = new MyNumeric(); }: 
                  n = number { $num.setFirstNumber($n.num); }
				  (s = sequence { $num.setSequence($s.seq);})?
                  ;

sequence returns [Sequence seq]
@init {
       $seq = new Sequence(); }:
                  COMMA n = number  { $seq = $seq.setSecondNumber( $n.num ); } 
                  (e = explizit     { $seq = $seq.setRemainder( $e.exp ); } 
                  | i = implizit)   { $seq = $seq.setRemainder( $i.imp ); } 
                  ;

explizit returns [Explizit exp]
@init {
       $exp = new Explizit(); }: 
                    (COMMA n = number { $exp.addNumber($n.num); } )*;

implizit returns [Implizit imp]
    : DOT DOT n = number { $imp = new Implizit($n.num); };

path returns [MyPath p]
@init {
       $p = new MyPath(); }: 
                (sl1 = SLASH{ $p.setIsRoot();  })? 
                (s1 = mixed sl2 = SLASH)+  { $p.add($s1.text);  } 
                s2 = mixed                 { $p.add($s2.text); }
                d = DOT                     
                s3 = mixed                 { $p.addExtension($s3.text); }
                ;

mixed returns [Mixed mmixed]
@init {
       $mmixed = new Mixed(); }: 
                (d = DOT                { $mmixed.add($d.text); }
                | c = COMMA             { $mmixed.add($c.text); }
                | s = SPACE             { $mmixed.add($s.text); }
                | dg = DIGIT            { $mmixed.add($dg.text); }
                | m = MINUS             { $mmixed.add($m.text); }
                | bb = BSLASH BSLASH    { $mmixed.add($bb.text); }
                | bhk = BSLASH HK       { $mmixed.add($bhk.text); }
                | sc = SMALLCHAR        { $mmixed.add($sc.text); }
                | cc = CAPITALCHAR      { $mmixed.add($cc.text); }
                )+;

number returns [MyNumber num]:
           i = integer      { $num = $i.mint; }
            | f = floating  { $num = $f.mfloat; }
            ;
integer returns [MyInteger mint]
@init {
	$mint = new MyInteger(); }:
           s = MINUS { $mint.setSign(); } ? 
		   n = DIGIT { $mint.setNumber($n.text); }
            ;

floating returns [MyFloat mfloat]: 
           s = MINUS { $mfloat.setSign(); } ? 
		   n = DIGIT DOT m = DIGIT 
           { $mfloat.setNumber($n.text, $m.text); }
            ;

STARTTAG    :   '<';
ENDTAG      :   '>';
SLASH       :   '/';
COMMA       :   ',';
DIGIT       :   ('0'..'9')+;
MINUS       :   '-';
DOT         :   '.';
EQ          :   '=';
HK          :   '"';
SMALLCHAR   :   ('a'..'z');
CAPITALCHAR :   ('A'..'Z');
WS          :   ('\t' | '\n' | '\r' | '\r\n')     { skip();};
SPACE       :   ' ';
BSLASH      :   '\\';