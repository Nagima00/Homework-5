public class Mark {
    private String place;
    private Style style;

    public Mark(String place, Style style) {
        this.place = place;
        this.style = style;
    }

    public void show() {
        style.draw(place);
    }
}