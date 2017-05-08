import lib.Variables;
import parser.ast.Expression;
import parser.Token;
import parser.Lexer;
import parser.Parser;
import parser.ast.Statement;

import java.util.List;

/**
 * @author: Brotandos.
 * @creation_date: 03.05.2017.
 */
public final class Main {
    public static void main(String[] args) {
        final String input = "word = 2 + 2\nword2 = PI + word";
        final List<Token> tokens = new Lexer(input).tokenize();
        for (Token token : tokens) {
            System.out.println(token);
        }

        final List<Statement> statements = new Parser(tokens).parse();
        for (Statement statement : statements) {
            System.out.println(statement);
        }
        for (Statement statement : statements) {
            statement.execute();
        }
        System.out.printf("%s = %f\n", "word", Variables.get("word"));
        System.out.printf("%s = %f", "word2", Variables.get("word2"));
    }
}