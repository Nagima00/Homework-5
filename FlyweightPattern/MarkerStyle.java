public class MarkerStyle {
    private String icon;
    private String color;
    private String labelStyle;

    public MarkerStyle(String icon, String color, String labelStyle) {
        this.icon = icon;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    public void draw(String locationName) {
        System.out.println("Drawing marker at: " + locationName +
                " with icon: " + icon + ", color: " + color + ", label style: " + labelStyle);
    }
}