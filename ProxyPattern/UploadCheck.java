public class UploadCheck {
    public static void upload(String name, boolean isLogin) {
        if (!isLogin) {
            System.out.println("Сіз кірмегенсіз. Сурет жүктей алмайсыз.");
        } else {
            System.out.println("Сурет жүктелді: " + name);
        }
    }
}