import java.util.HashMap;

public class StyleMaker {
    private static HashMap<String, Style> map = new HashMap<>();

    public static Style getStyle(String icon, String color) {
        String key = icon + color;
        if (!map.containsKey(key)) {
            map.put(key, new Style(icon, color));
            System.out.println("Жаңа стиль жасалды: " + key);
        }
        return map.get(key);
    }

    public static int count() {
        return map.size();
    }
}