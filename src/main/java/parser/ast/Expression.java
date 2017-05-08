package parser.ast;

/**
 * @author: Brotandos.
 * @creation_date: 04.05.2017.
 */
public interface Expression {
    double eval();
    @Override String toString();
}
