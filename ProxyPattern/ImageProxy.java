public class ImageProxy implements Image {
    private String name;
    private BigImage bigImg;

    public ImageProxy(String name) {
        this.name = name;
    }

    @Override
    public void showSmall() {
        System.out.println("Кішкентай сурет дайын: " + name);
    }

    @Override
    public void showFull() {
        if (bigImg == null) {
            bigImg = new BigImage(name);
        }
        bigImg.showFull();
    }
}