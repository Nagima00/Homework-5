public class Main {
    public static void main(String[] args) {
        Image img = new ImageProxy("uy1.jpg");
        img.showSmall();
        img.showFull();

        UploadCheck.upload("jañaUy.jpg", false);
        UploadCheck.upload("jañaUy.jpg", true);
    }
}