public class HighResImage implements Image {
    private String filename;

    public HighResImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading high-res image from disk: " + filename);
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Displaying low-res thumbnail of " + filename);
    }

    @Override
    public void displayFullImage() {
        System.out.println("Displaying full high-res image: " + filename);
    }
}