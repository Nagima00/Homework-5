import java.util.HashMap;
import java.util.Map;

public class MarkerStyleFactory {
    private static Map<String, MarkerStyle> styles = new HashMap<>();

    public static MarkerStyle getStyle(String icon, String color, String labelStyle) {
        String key = icon + color + labelStyle;
        if (!styles.containsKey(key)) {
            styles.put(key, new MarkerStyle(icon, color, labelStyle));
            System.out.println("Created new MarkerStyle: " + key);
        }
        return styles.get(key);
    }

    public static int getUniqueStylesCount() {
        return styles.size();
    }
}