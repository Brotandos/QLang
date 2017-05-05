import entity.Expression;
import entity.Token;
import parser.Lexer;
import parser.Parser;

import java.util.List;

/**
 * @author: Brotandos.
 * @creation_date: 03.05.2017.
 */
public final class Main {
    public static void main(String[] args) {
        final String input = "(2.75 + 2) * #0F";
        final List<Token> tokens = new Lexer(input).tokenize();
        for (Token token : tokens) {
            System.out.println(token);
        }

        final List<Expression> expressions = new Parser(tokens).parse();
        for (Expression expression : expressions) {
            System.out.println(expression + " = " + expression.eval());
        }
    }
}