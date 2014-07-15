/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar WekaConfigParser;
configfile      : element+;
element         : STARTTAG SPACE* string (SPACE+ attributes)? SPACE* (shortend | longend);
attributes      : (keyvalue SPACE+ attributes | keyvalue)+;
keyvalue        : string EQ HK value HK;
longend         : ENDTAG element+ STARTTAG SLASH string ENDTAG;
shortend        : SLASH ENDTAG;
string          : (SMALLCHAR 
                  | CAPITALCHAR)+;

value           : (string 
                | numeric 
                | mixed);
numeric         : number sequence?;
sequence        : COMMA number (explizit | implizit);
explizit        : (COMMA number)*;
implizit        : DOT DOT number; 

nosequence      : (number 
                | path 
                | string 
                | mixed);
path            : SLASH? (string SLASH)+ string DOT string;
mixed           : (DOT 
                | COMMA 
                | SPACE 
                | DIGIT 
                | MINUS 
                | BSLASH BSLASH 
                | BSLASH HK 
                | SMALLCHAR 
                | CAPITALCHAR
                )+;
number :
           integer 
            | floating;
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
DOT         :   '.';
EQ          :   '=';
HK          :   '"';
SMALLCHAR   :   ('a'..'z');
CAPITALCHAR :   ('A'..'Z');
WS          :   ('\t' | '\n' | '\r' | '\r\n')     { skip();};
SPACE       :   ' ';
BSLASH      :   '\\';