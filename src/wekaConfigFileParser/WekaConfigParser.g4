/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

grammar WekaConfigParser;
configfile      : element+;
element         : STARTTAG SPACE* string (SPACE+ attributelist)? SPACE* elementend;
elementend      : (shortend | longend);
attributelist   : (keyvalue SPACE*)+;
keyvalue        : string EQ HK value HK;
longend         : ENDTAG element+ STARTTAG SLASH string ENDTAG;
shortend        : SLASH ENDTAG;
string          : (SMALLCHAR 
                  | CAPITALCHAR)+;

value           : (string 
                | numeric 
                | mixed
                | path);
numeric         : number sequence?;
sequence        : COMMA number (explizit | implizit);
explizit        : (COMMA number)*;
implizit        : DOT DOT number; 

nosequence      : (number 
                | path 
                | string 
                | mixed);
path            : SLASH? (mixed SLASH)+ (mixed DOT mixed)?;
mixed           : (DOT 
                | COMMA 
                | SPACE 
                | DIGIT 
                | MINUS 
                | BSLASH BSLASH 
                | BSLASH HK 
                | SMALLCHAR 
                | CAPITALCHAR
                | USCORE
                )+;
number :
           integer 
            | floating
            | power;
power : (integer | floating) HEAD (integer | floating);
integer :
           MINUS? DIGIT;

floating: 
           MINUS? DIGIT DOT DIGIT?;

STARTTAG    :   '<';
ENDTAG      :   '>';
SLASH       :   '/';
COMMA       :   ',';
DIGIT       :   ('0'..'9')+;
MINUS       :   '-';
USCORE      :   '\u005F';
DOT         :   '.';
EQ          :   '=';
HK          :   '"';
SMALLCHAR   :   ('a'..'z');
CAPITALCHAR :   ('A'..'Z');
WS          :   ('\t' | '\n' | '\r' | '\r\n')     { skip();};
SPACE       :   ' ';
BSLASH      :   '\\';
HEAD        :   '^';