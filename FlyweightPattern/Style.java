public class Style {
    private String icon;
    private String color;

    public Style(String icon, String color) {
        this.icon = icon;
        this.color = color;
    }

    public void draw(String place) {
        System.out.println(place + " белгісі: " + icon + ", түсі: " + color);
    }
}