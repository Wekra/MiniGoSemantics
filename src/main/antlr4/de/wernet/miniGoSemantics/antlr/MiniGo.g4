grammar MiniGo;

//parser rules
prog      : block ;
block     : '{' statement '}' ;
statement : statement ';' statement
			| 'go' block
			| vars '<-' aexp
			| '<-' vars
			| vars ':=' bexp
			| vars ':=' 'newChannel'
			| vars '=' bexp
			| 'while' bexp block
			| 'print' aexp ;
bexp : cexp ( '&&' cexp )* ;
cexp : cterm | cterm '==' cterm ;
cterm : aexp | aexp '>' aexp ;
aexp : term ( '+' term | '-' term )* ;
term : factor ( '*' factor | '/' factor )* ;
factor :  ints | bools | vars | '<-' vars | '!' factor | '(' bexp ')' ;
//digit : '0'..'9' ;
ints :  DIGIT (DIGIT)* ;
bools : 'true' | 'false' ;
//letter : 'a'..'z' ;
vars : LETTER (DIGIT | LETTER)* ;
//skip tabs and other stuff
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

//lexer rules
DIGIT : [0-9];
LETTER : [a-z];