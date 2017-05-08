package lib;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Brotandos.
 * @creation_date: 05.05.2017.
 */
public final class Variables {
    private static Map<String, Double> variables;
    static {
        variables = new HashMap<>();
        variables.put("PI", Math.PI);
        variables.put("E", Math.E);
    }

    public static boolean isExists(String key) {
        return variables.containsKey(key);
    }

    public static double get(String key) {
        if (!isExists(key)) throw new RuntimeException(String.format("Constant named \"%s\" doesn't exist.", key));
        return variables.get(key);
    }

    public static void set(String key, double value) {
        variables.put(key, value);
    }
}
