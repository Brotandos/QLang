package parser.ast;

/**
 * @author: Brotandos.
 * @creation_date: 05.05.2017.
 */
public final class UnaryExpression implements Expression {
    private final Expression expression;
    private final char operation;

    public UnaryExpression(char operation, Expression expression) {
        this.operation = operation;
        this.expression = expression;
    }

    @Override
    public double eval() {
        switch (operation) {
            case '-': return -expression.eval();
            case '+':
                default:
                    return expression.eval();
        }
    }

    @Override
    public String toString() {
        return String.format("%c%s", operation, expression);
    }
}
