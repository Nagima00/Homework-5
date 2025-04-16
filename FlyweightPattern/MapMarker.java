public class MapMarker {
    private String location;
    private MarkerStyle style;

    public MapMarker(String location, MarkerStyle style) {
        this.location = location;
        this.style = style;
    }

    public void draw() {
        style.draw(location);
    }
}