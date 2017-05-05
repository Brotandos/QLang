package entity;

/**
 * @author: Brotandos.
 * @creation_date: 04.05.2017.
 */
public final class BinaryExpression implements Expression {
    private final char operation;
    private final Expression expr1, expr2;

    public BinaryExpression(char operation, Expression expr1, Expression expr2) {
        this.operation = operation;
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public double eval() {
        switch (operation) {
            case '-': return expr1.eval() - expr2.eval();
            case '/': return expr1.eval() / expr2.eval();
            case '*': return expr1.eval() * expr2.eval();
            case '+':
                default:
                    return expr1.eval() + expr2.eval();
        }
    }

    @Override
    public String toString() {
        return String.format("[%s %c %s]", expr1, operation, expr2);
    }
}