package parser.ast;

/**
 * @author: Brotandos.
 * @creation_date: 09.05.2017.
 */
public final class PrintStatement implements Statement {
    private final Expression expression;

    public PrintStatement(Expression expression) {
        this.expression = expression;
    }

    @Override
    public void execute() {
        System.out.println(expression.eval());
    }

    @Override
    public String toString() {
        return "print " + expression;
    }
}
