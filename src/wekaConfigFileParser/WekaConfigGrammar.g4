/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar WekaConfigGrammar;
@header {
    package wekaConfigFileParser;
    import java.util.List;
    import java.util.ArrayList;
    import org.antlr.v4.runtime.Parser;
    import wekaConfigFileInterpretation.*;
 }

configfile returns [ConfigFile f]
@init {
       $f = new ConfigFile(); }: 
              (e = element { $f.addElement($e.el); })+;

element returns [Element el]
@init {
       $el = new Element(); }: 
           STARTTAG SPACE* name = string    { $el.setElementName($name.mstring); }
           (SPACE+ a = attributelist        { $el.setAttributeList($a.attr); } )? 
           SPACE* e = elementend            { $el.setElementEnd($e.end); }
           ;

elementend returns [ElementEnd end] :
                    (l = longend    { $end = $l.le; }
                    | s = shortend  { $end = $s.se; }) 
                    ;

attributelist returns [AttributeList attr]
@init {
       $attr = new AttributeList();}: 
              (k1 = keyvalue { $attr.addKeyValue($k1.kv); } SPACE* )+
              ;

keyvalue returns [KeyValue kv]: 
            s = string EQ HK v = value HK {$kv = new KeyValue($s.mstring, $v.val); };

longend returns [Longend le]
@init {
       $le = new Longend();}: 
           ENDTAG (e = element { $le.addElement($e.el);})+ 
           STARTTAG SLASH s = string { $le.setEndName($s.mstring); } ENDTAG;

shortend returns [ShortEnd se]: 
            SLASH ENDTAG {$se = new ShortEnd(); };

string returns [MyString mstring]
@init {
       $mstring = new MyString(); }: 
                  (s = SMALLCHAR    { $mstring.add($s.text); }
                  |c = CAPITALCHAR  { $mstring.add($c.text); })
                  +;

value returns [Value val]: 
                (s = string     { $val = $s.mstring; }
                | n = numeric   { $val = $n.num; }
                | m = mixed     { $val = $m.mmixed; }
				| p = path		{ $val = $p.p;}
                );

numeric returns [MyNumeric num]
@init {
	MyNumber mn = null;
        Sequence seq = null;}: 
                  n = number { mn = $n.num; }
		(s = sequence { seq = $s.seq;})?
                  ;
        finally {
                 if(seq == null)
                    $num = mn;
                 else {
                       $num = seq;
                       $num.setFirstNumber(mn);
                 }
 }

sequence returns [Sequence seq]
@init {
       MyNumber nm = null;}:
                  COMMA n = number  { nm = $n.num; } 
                  (e = explizit     { $seq =  $e.exp; } 
                  | i = implizit)   { $seq = $i.imp; } 
                  ;
finally {
         $seq.setNextNumber(nm); }

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
                (s1 = mixed sl2 = SLASH)+  { $p.add($s1.mmixed);  } 
                s2 = mixed                 { $p.add($s2.mmixed); }
                d = DOT                     
                s3 = mixed                 { $p.setExtension($s3.mmixed); }
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
            | p = power     { $num = $p.mPow; }
            ;
power returns [MyPower mPow]
@init {
       $mPow = new MyPower(); }: 
            (
                  i = integer   {$mPow.setBase($i.mint);}
                | f = floating  {$mPow.setBase($f.mfloat);}
            ) 
            HEAD 
            (
                  i = integer   {$mPow.setExponent($i.mint);}
                | f = floating  {$mPow.setExponent($f.mfloat);}
            )
            ;

integer returns [MyInteger mint]
@init {
	$mint = new MyInteger(); }:
           (s = MINUS { $mint.setSign(); }) ? 
		   n = DIGIT { $mint.setNumber($n.text); }
            ;

floating returns [MyFloat mfloat]
@init {
       $mfloat = new MyFloat(); }: 
           (s = MINUS { $mfloat.setSign(); }) ? 
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
HEAD        :   '^';