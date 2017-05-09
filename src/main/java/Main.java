import lib.Variables;
import parser.ast.Expression;
import parser.Token;
import parser.Lexer;
import parser.Parser;
import parser.ast.Statement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author: Brotandos.
 * @creation_date: 03.05.2017.
 */
public final class Main {
    public static void main(String[] args) throws IOException {
        final String input = new String(Files.readAllBytes(Paths.get("program.txt")), "UTF-8");
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
    }
}