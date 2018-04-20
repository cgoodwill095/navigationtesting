grammar dategrammar2;


/*
 * Lexer Rules
 */


/*
 * Parser Rules
 */
DIGIT: ('0'..'9');

start:	(date NEWLINE)*;
date: ddate|dshortcut;

dshortcut:(DIGIT|'1'|'0')* ('d'|'D') (mshortcut)?;

mshortcut:(DIGIT|'1'|'0')* ('m'|'M') (yshortcut)?;

yshortcut:(DIGIT|'1'|'0')* ('y'|'Y');

ddate:(DIGIT|'1'|'0') (DIGIT|'1'|'0') mdate;

mdate:('0'|'1')(DIGIT|'1'|'0') ydate;

ydate:((DIGIT|'1'|'0') (DIGIT|'1'|'0') (DIGIT|'1'|'0') (DIGIT|'1'|'0'));

NEWLINE : [\r\n]+ ;
