grammar MiniGo;

//parser rules
prog      : block ;
block     : '{' statement '}' ;
statement : statement ';' statement #StatementSequence
			| 'go' block #GoBlock
			| vars '<-' aexp #AssignementThroughChannel
			| '<-' vars #GetValueFromChannel
			| vars ':=' bexp #VariableDeclaration
			| vars ':=' 'newChannel' #ChannelDeclaration
			| vars ':=' '<-' vars #VariableDeclarationThroughChannel
			| vars '=' bexp #VariableAssignement
			| 'while' bexp block #While
			| 'if' bexp block 'else' block #IfElse
			| 'print' aexp #Print ;
bexp : cexp ( '&&' cexp )* ;
cexp : cterm /*#OnlyCTerm*/ | cterm '==' cterm /*#Evaluation*/ ;
cterm : aexp /*#OnlyAExp*/ | aexp '>' aexp /*#GreaterThan*/;
aexp : term ( '+' term | '-' term )* ;
term : factor ( '*' factor | '/' factor )* ;
factor :  ints #Integer | bools #Boolean | vars #Variable| '!' factor #Not| '(' bexp ')' #Parantheses ;
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