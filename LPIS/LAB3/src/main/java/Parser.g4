grammar Parser;

compilationUnit
    : typeDeclaration* EOF
    ;

typeDeclaration
    : classDeclaration
    | ';'
    ;

variableModifier
    : FINAL
    ;

classDeclaration
    : CLASS IDENTIFIER
      classBody
    ;

classBody
    : '{' classBodyDeclaration* '}'
    ;

classBodyDeclaration
    : ';'
    | memberDeclaration
    ;

memberDeclaration
    : methodDeclaration
    ;
	
methodDeclaration
    : typeTypeOrVoid IDENTIFIER formalParameters ('[' ']')*
      methodBody
    ;

methodBody
    : block
    | ';'
    ;

typeTypeOrVoid
    : typeType
    | VOID
    ;

variableDeclarators
    : variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    : variableDeclaratorId ('=' variableInitializer)?
    ;

variableDeclaratorId
    : IDENTIFIER ('[' ']')*
    ;

variableInitializer
    : arrayInitializer
    | expression
    ;

arrayInitializer
    : '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

formalParameters
    : '(' formalParameterList? ')'
    ;

formalParameterList
    : formalParameter (',' formalParameter)*
    ;

formalParameter
    : variableModifier* typeType variableDeclaratorId
    ;

literal
    : integerLiteral
    | floatLiteral
    | BOOL_LITERAL
    ;

integerLiteral
    : DECIMAL_LITERAL
    ;

floatLiteral
    : FLOAT_LITERAL
    ;

// STATEMENTS / BLOCKS

block
    : '{' blockStatement* '}'
    ;

blockStatement
    : localVariableDeclaration ';'
    | statement
    ;

localVariableDeclaration
    : variableModifier* typeType variableDeclarators
    ;

statement
    : blockLabel=block
    | IF parExpression statement (ELSE statement)?
    | FOR '(' forControl ')' statement
    | WHILE parExpression statement
    | RETURN expression? ';'
    | SEMI
    | statementExpression=expression ';'
    ;

forControl
    : enhancedForControl
    | forInit? ';' expression? ';' forUpdate=expressionList?
    ;

forInit
    : localVariableDeclaration
    | expressionList
    ;

enhancedForControl
    : variableModifier* typeType variableDeclaratorId ':' expression
    ;

// EXPRESSIONS

parExpression
    : '(' expression ')'
    ;

expressionList
    : expression (',' expression)*
    ;

methodCall
    : IDENTIFIER '(' expressionList? ')'
    ;

expression
    : primary
    | expression bop='.'
      ( IDENTIFIER
      | methodCall
      )
    | expression '[' expression ']'
    | methodCall
    | '(' typeType ')' expression
    | expression postfix=('++' | '--')
    | prefix=('+'|'-'|'++'|'--') expression
    | prefix='!' expression
    | expression bop=('*'|'/'|'%') expression
    | expression bop=('+'|'-') expression
    | expression bop=('<=' | '>=' | '>' | '<') expression
    | expression bop=('==' | '!=') expression
    | expression bop='^' expression
    | expression bop='&&' expression
    | expression bop='||' expression
    | <assoc=right> expression
      bop=('=' | '+=' | '-=' | '*=' | '/=')
      expression
	;

primary
    : '(' expression ')'
    | literal
    | IDENTIFIER
    ;
	
typeType
    : typeType ('[' ']')
	| primitiveType
    ;

primitiveType
    : BOOLEAN
    | INT
    | DOUBLE
    ;

    // Keywords

    BOOLEAN:            'boolean';
    CONST:              'const';
    DOUBLE:             'double';
    ELSE:               'else';
    FINAL:              'final';
    FOR:                'for';
    IF:                 'if';
    INT:                'int';
    RETURN:             'return';
    VOID:               'void';
    WHILE:              'while';
    CLASS:              'class';

    // Literals

    DECIMAL_LITERAL:    ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?;

    FLOAT_LITERAL:      (Digits '.' Digits? | '.' Digits) ExponentPart? [fFdD]?
                 |       Digits (ExponentPart [fFdD]? | [fFdD])
                 ;

    BOOL_LITERAL:       'true'
                |       'false'
                ;
    // Separators
    LPAREN:             '(';
    RPAREN:             ')';
    LBRACE:             '{';
    RBRACE:             '}';
    SEMI:               ';';
    COMMA:              ',';
    DOT:                '.';
    // Operators
    ASSIGN:             '=';
    GT:                 '>';
    LT:                 '<';
    BANG:               '!';
    EQUAL:              '==';
    LE:                 '<=';
    GE:                 '>=';
    NOTEQUAL:           '!=';
    AND:                '&&';
    OR:                 '||';
    INC:                '++';
    DEC:                '--';
    ADD:                '+';
    SUB:                '-';
    MUL:                '*';
    DIV:                '/';
    CARET:              '^';
    MOD:                '%';
    ADD_ASSIGN:         '+=';
    SUB_ASSIGN:         '-=';
    MUL_ASSIGN:         '*=';
    DIV_ASSIGN:         '/=';

    WS:                 [ \t\r\n\u000C]+ -> channel(HIDDEN);

    IDENTIFIER:         Letter LetterOrDigit*;

    // Fragment rules

    fragment ExponentPart
        : [eE] [+-]? Digits
        ;
    fragment Digits
        : [0-9] ([0-9_]* [0-9])?
        ;
    fragment LetterOrDigit
        : Letter
        | [0-9]
        ;
    fragment Letter
        : [a-zA-Z$_] // these are the "java letters" below 0x7F
        | ~[\u0000-\u007F\uD800-\uDBFF] // covers all characters above 0x7F which are not a surrogate
        | [\uD800-\uDBFF] [\uDC00-\uDFFF] // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        ;