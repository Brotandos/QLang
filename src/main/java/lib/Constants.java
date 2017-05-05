package lib;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Brotandos.
 * @creation_date: 05.05.2017.
 */
public final class Constants {
    private static Map<String, Double> constants;
    static {
        constants = new HashMap<>();
        constants.put("PI", Math.PI);
        constants.put("E", Math.E);
    }

    public static boolean isExists(String key) {
        return constants.containsKey(key);
    }

    public static double get(String key) {
        if (!isExists(key)) throw new RuntimeException(String.format("Constant named \"%s\" doesn't exist.", key));
        return constants.get(key);
    }
}
