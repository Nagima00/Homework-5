public class BigImage implements Image {
    private String name;

    public BigImage(String name) {
        this.name = name;
        load();
    }

    private void load() {
        System.out.println("Жоғары сапалы сурет жүктелді: " + name);
    }

    @Override
    public void showSmall() {
        System.out.println("Кішкентай сурет көрсетілді: " + name);
    }

    @Override
    public void showFull() {
        System.out.println("Толық сурет көрсетілді: " + name);
    }
}