grammar mysql;


start: statement (';')?  EOF;

statement:
	  create_table
    | create_index
    | update
    | insert
    | delete
    | select
    ;



create_table
   : CREATE (' ')* TABLE (' ')* table_name (' ')* LEFT_PARENTHESIS (' ')create_table_column (' ')((' ')COMMA (' ')*create_table_column) (' ')((' ')*COMMA PRIMARY_KEY LEFT_PARENTHESIS clustering_key RIGHT_PARENTHESIS)? (' ') RIGHT_PARENTHESIS;


//CREATE INDEX index_name
//ON table_name (column1, column2, ...); 
create_index: (' ')* CREATE (' ')* INDEX (' ')* IDENTIFIER (' ')* ON (' ')* table_name (' ')LEFT_PARENTHESIS (' ')*columnName (' ') ((' ')COMMA (' ')*columnName) RIGHT_PARENTHESIS (' ')* ;



//UPDATE table_name SET column1 = value1, column2 = value2, ...
//WHERE condition;
update:' '* UPDATE (' ')* table_name (' ')* SET (' ')* columnName (' ')* EQUALS (' ')* constant (' ')* ( (' ')* COMMA (' ')columnName (' ') EQUALS (' ')constant) (' ')* WHERE (' ')* clustering_key (' ')* EQUALS (' ')* clustering_key_value;

//constant is value

//INSERT INTO table_name (column1, column2, column3, ...)
//VALUES (value1, value2, value3, ...);
insert: ' '* INSERT (' ')* INTO (' ')* table_name (' ')* LEFT_PARENTHESIS (' ')* columnName (' ')* ((' ')* COMMA (' ')* columnName)* (' ')* RIGHT_PARENTHESIS (' ')* VALUES (' ')* LEFT_PARENTHESIS (' ')* constant ((' ')COMMA (' ') constant)* (' ')* RIGHT_PARENTHESIS (' ')*;



//DELETE FROM table_name WHERE condition;

delete:' '* DELETE (' ')* FROM (' ')* table_name (' ')* (WHERE (' ')* columnName (' ')* EQUALS (' ')* constant (' ')* (AND  (' ')* columnName (' ')EQUALS (' ') constant))? (' ') ;

select:' '* SELECT (' ')* ASTERISK (' ')* FROM (' ')* table_name (' ')* WHERE (' ')* columnName (' ')* operation (' ')* constant (' ')* ((' ')operator (' ') columnName (' ')* operation (' ')constant) (' ')* ;
    
create_table_column: columnName columnType (PRIMARY_KEY)?;

clustering_key: columnName;

clustering_key_value: constant;

columnName: IDENTIFIER ;

columnType: type;

//values:  LEFT_PARENTHESIS constants RIGHT_PARENTHESIS;

type: INT_TYPE | FLOAT_TYPE | STRING_TYPE | DOUBLE_TYPE | VARCHAR_TYPE | DECIMAL_TYPE | ;

//constants :constant (COMMA constant)*;

operation:EQUALS | GT | GE| LT| LE | NE;

operator: XOR| AND| OR;


table_name : IDENTIFIER;
    
constant
    :(MINUS | PLUS)? INTEGER_VALUE
    | (MINUS | PLUS)? DECIMAL_VALUE
    | QUOTED_STRING+
    ;

CREATE :' '* ('C' | 'c') ('R' | 'r') ('E' | 'e') ('A' | 'a') ('T' | 't') ('E' | 'e') ' '*;
SELECT : ' '('S' | 's') ('E' | 'e') ('L' | 'l') ('E' | 'e') ('C' | 'c') ('T' | 't') ' ';
FROM : ' '('F' | 'f') ('R' | 'r') ('O' | 'o') ('M' | 'm')' ';
TABLE : ' '('T' | 't') ('A' | 'a') ('B' | 'b') ('L' | 'l') ('E' | 'e')' ';
INSERT : ' '('I' | 'i') ('N' | 'n') ('S' | 's') ('E' | 'e') ('R' | 'r') ('T' | 't') ' ';
INTO : ' '('I' | 'i') ('N' | 'n') ('T' | 't') ('O' | 'o')' ';
VALUES : ' '('V' | 'v') ('A' | 'a') ('L' | 'l') ('U' | 'u')('E'|'e')('S'|'s')' ';
UPDATE :' '* ('U' | 'u') ('P' | 'p') ('D' | 'd') ('A' | 'a') ('T' | 't') ('E' | 'e') ' '*;
SET : ' '('S' | 's') ('E' | 'e') ('T' | 't')' ';
WHERE : ' '('W' | 'w') ('H' | 'h') ('E' | 'e') ('R' | 'r') ('E' | 'e')' ';
DELETE : ' '('D' | 'd') ('E' | 'e') ('L' | 'l') ('E' | 'e') ('T' | 't') ('E' | 'e') ' ';
PRIMARY_KEY : ' '('P' | 'p') ('R' | 'r') ('I' | 'i') ('M' | 'm') ('A' | 'a') ('R' | 'r') ('Y' | 'y') ' ' ('K' | 'k') ('E' | 'e') ('Y' | 'y')' ';
INDEX: ' '*('I'|'i')('N'|'n')('D'|'d')('E'|'e')('X'|'x');
ON: ('o'|'O')('N'|'n')' '*;
INT_TYPE: ' '('I'|'i')('N'|'n')('T'|'t')' ';
FLOAT_TYPE:' '('F'|'f')('L'|'l')('O'|'o')('A'|'a')('T'|'t')' ';
STRING_TYPE: ' '('S'|'s')('T'|'t')('R'|'r')('I'|'i')('N'|'n')('G'|'g')' ';
DOUBLE_TYPE: ' '* ('D'|'d')('O'|'o')('u'|'U')('B'|'b')('l'|'L')('E'|'e')' '*;
VARCHAR_TYPE: ' '('V'|'v')('A'|'a')('R'|'r')('C'|'c')('H'|'h')('A'|'a')('R'|'r') (' ')*LEFT_PARENTHESIS (' ') INTEGER_VALUE (' ')RIGHT_PARENTHESIS ' ';
DECIMAL_TYPE: ' '('D'|'d')('E'|'e')('C'|'c')('I'|'i')('M'|'m')('A'|'a')('L'|'l') (' ')*LEFT_PARENTHESIS (' ')*INTEGER_VALUE (' ')*COMMA (' ')*INTEGER_VALUE RIGHT_PARENTHESIS ' ';
COMMA: ',';
ASTERISK: '*';
LEFT_PARENTHESIS: '(';
RIGHT_PARENTHESIS: ')';
EQUALS: '=';
NOT : '!';
MINUS : '-';
PLUS: '+';
GT: '>';
GE: '>=';
LT: '<';
LE: '<=';
NE: '!=';


AND:  ('A'|'a') ('N'|'n') ('D'|'d');
OR:  ('O'|'o')('R'|'r');
XOR: ('X'|'x')('O'|'o')('R'|'r');

QUOTED_STRING:'\'' ( ~('\''|'\\') | ('\\' .) )* '\''
    | '"' ( ~('"'|'\\') | ('\\' .) )* '"'|
    '\'' ( ~'\'' | '\'\'' )* '\'' { setText(getText().substring(1, getText().length()-1)); };

INTEGER_VALUE
    : DIGIT+
    ;

DECIMAL_VALUE
    : DECIMAL_DIGITS
    ;

IDENTIFIER
    : LETTER (LETTER | DIGIT)*
    ;

fragment DECIMAL_DIGITS
    : DIGIT+ '.' DIGIT+;

fragment DIGIT
    : [0-9]
    ;

fragment LETTER
    : [a-zA-Z]
    ;

WS: [ \r\n\t]+ -> skip;