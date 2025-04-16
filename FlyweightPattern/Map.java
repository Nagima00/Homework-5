import java.util.ArrayList;

public class Map {
    public static void main(String[] args) {
        ArrayList<Mark> list = new ArrayList<>();

        String[] city = {"Astana", "Almaty", "Aktobe"};

        for (String c : city) {
            list.add(new Mark(c, StyleMaker.getStyle("hosp.png", "red")));
        }

        for (String c : city) {
            list.add(new Mark(c + " Gas", StyleMaker.getStyle("gas.png", "blue")));
        }

        for (Mark m : list) {
            m.show();
        }

        System.out.println("Барлығы: " + list.size() + " белгі");
        System.out.println("Уникал стиль саны: " + StyleMaker.count());
    }
}