import java.util.ArrayList;
import java.util.List;

public class MapApp {
    public static void main(String[] args) {
        List<MapMarker> markers = new ArrayList<>();
        String[] locations = {"Astana", "Almaty", "Shymkent", "Kokshetau", "Aktobe"};

        for (String loc : locations) {
            MarkerStyle style = MarkerStyleFactory.getStyle("hospital.png", "red", "bold");
            markers.add(new MapMarker(loc, style));
        }

        for (String loc : locations) {
            MarkerStyle style = MarkerStyleFactory.getStyle("gas.png", "blue", "italic");
            markers.add(new MapMarker(loc + " Station", style));
        }

        markers.forEach(MapMarker::draw);
        System.out.println("Total Markers: " + markers.size());
        System.out.println("Unique Styles Used: " + MarkerStyleFactory.getUniqueStylesCount());
    }
}