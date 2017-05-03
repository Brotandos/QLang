import entity.Token;
import parser.Lexer;

import java.util.List;

/**
 * @author: Brotandos.
 * @creation_date: 03.05.2017.
 */
public final class Main {
    public static void main(String[] args) {
        final String input = "2 + 2";
        final List<Token> tokens = new Lexer(input).tokenize();
        for (Token token : tokens) {
            System.out.println(token);
        }
    }
}
