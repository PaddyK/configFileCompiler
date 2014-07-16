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
                );

numeric returns [MyNumeric num]: 
                  n = number s = sequence? 
                  { $num = new MyNumeric($n.num, $s.seq); }
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
                sl1 = SLASH                 { $p.add($sl1.text); }? 
                (s1 = string sl2 = SLASH)+  { $p.add($s1.text); $p.add($sl2.text); } 
                s2 = string                 { $p.add($s2.text); }
                d = DOT                     { $p.add($d.text); }
                s3 = string                 { $p.add($s3.text); }
                ;

mixed returns [Mixed mmixed]
@init {
       $mmixed = ""; }: 
                (d = DOT                { $mmixed += $d.text; }
                | c = COMMA             { $mmixed += $c.text; }
                | s = SPACE             { $mmixed += $s.text; }
                | dg = DIGIT            { $mmixed += $dg.text; }
                | m = MINUS             { $mmixed += $m.text; }
                | bb = BSLASH BSLASH    { $mmixed += $bb.text; }
                | bhk = BSLASH HK       { $mmixed += $bhk.text; }
                | sc = SMALLCHAR        { $mmixed += $sc.text; }
                | cc = CAPITALCHAR      { $mmixed += $cc.text; }
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