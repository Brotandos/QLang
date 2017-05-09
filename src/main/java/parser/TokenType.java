package parser;

/**
 * @author: Brotandos.
 * @creation_date: 03.05.2017.
 */
public enum TokenType {

    NUMBER,
    HEX_NUMBER,
    WORD,

    // keyword
    PRINT,

    PLUS,
    MINUS,
    STAR,
    SLASH,
    EQ,

    LPAREN, // (
    RPAREN, // )

    EOF
}
