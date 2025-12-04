package flyweight;

import java.util.HashMap;
import java.util.Map;

public class PictureFactory {

    private static final Map<String, PictureType> pool = new HashMap<>();

    public static PictureType getPictureType(String key) {
        return pool.computeIfAbsent(key, k -> {
            String[] row = k.split("-");
            return new Picture(row[0], row[1]);
        });
    }
}