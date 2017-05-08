package parser.ast;

import lib.Variables;

/**
 * @author: Brotandos.
 * @creation_date: 05.05.2017.
 */
public final class VariableExpression implements Expression {
    private final String name;

    public VariableExpression(String name) {
        this.name = name;
    }

    @Override
    public double eval() {
        if (!Variables.isExists(name)) throw new RuntimeException(String.format("Constant named \"%s\" doesn't exist", name));
        return Variables.get(name);
    }

    @Override
    public String toString() {
        //return String.format("%s [%f]", name, Variables.get(name));
        return String.format("%s", name);
    }
}
