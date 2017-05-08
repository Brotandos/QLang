package parser.ast;

/**
 * @author: Brotandos.
 * @creation_date: 04.05.2017.
 */
public final class NumberExpression implements Expression {
    private final double value;

    public NumberExpression(double value) {
        this.value = value;
    }

    @Override
    public double eval() {
        return value;
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }
}
