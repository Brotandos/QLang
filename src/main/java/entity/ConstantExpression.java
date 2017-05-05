package entity;

import lib.Constants;

/**
 * @author: Brotandos.
 * @creation_date: 05.05.2017.
 */
public final class ConstantExpression implements Expression {
    private final String name;

    public ConstantExpression(String name) {
        this.name = name;
    }

    @Override
    public double eval() {
        if (!Constants.isExists(name)) throw new RuntimeException(String.format("Constant named \"%s\" doesn't exist", name));
        return Constants.get(name);
    }

    @Override
    public String toString() {
        //return String.format("%s [%f]", name, Constants.get(name));
        return String.format("%s", name);
    }
}
