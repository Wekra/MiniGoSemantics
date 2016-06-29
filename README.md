# MiniGo - Operational semantics check
This project serves as assignment in the lecture "Model-based software development". 
It implements the operational semantics check for a custom programming language called "MiniGo".
The grammar to this language can be found in the file [MiniGo.g4](https://github.com/Wekra/MiniGoSemantics/blob/master/src/main/antlr4/de/wernet/miniGoSemantics/antlr/MiniGo.g4).

To generate the parser as well as the base listener and visitor classes for MiniGo, I used the parser-tool [Antlr4](www.antlr.org).

As of the actual state seen in the master-branch, it supports only the non-concurrent statements.
Furthermore, the state used to store the found variables and their values only operates at a global scope. 
Local scopes in while-loops of if/else-statements are not supported yet.
