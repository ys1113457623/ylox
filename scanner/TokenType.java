package ylox.scanner;
//An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
enum TokenType {
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE, COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,

    BANG, BANG_EQUAL,
    EQUAL, EQUAL_EQUAL, 
    GREATER, GREATER_EQUAL,
    LESS, LESS_EQUAL,

    IDENTIFIER, STRING, NUMBER,


    AND,CLASS,ELSE,FALSE,FUN,FOR,IF,NIL,OR,PRINT,RETURN,SUPER,THIS,TRUE,VAR,WHILE,

    EOF
}
