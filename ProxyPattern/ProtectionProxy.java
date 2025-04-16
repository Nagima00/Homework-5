public class ProtectionProxy {
    public static void uploadImage(String filename, boolean isLoggedIn) {
        if (!isLoggedIn) {
            System.out.println("Access Denied: Please log in to upload images.");
        } else {
            System.out.println("Image '" + filename + "' uploaded successfully.");
        }
    }
}