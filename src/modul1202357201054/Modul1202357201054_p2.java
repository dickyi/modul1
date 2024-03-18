package modul1202357201054;

public class Modul1202357201054_p2 {

    public static void main(String[] args) {
        String[][] data = {{"ABDUL", "\t085646668991", "Kediri"},
        {"KUSNO", "085646668992", "Trenggalek"},
        {"PONIRAN", "085646668999", "Bojonegoro"}};

        System.out.println("NAMA\t\tALAMAT\t\t\tTELEPON");
        for (String[] ke : data) {
            System.out.println(ke[0] + "\t\t" + ke[2] + "\t\t" + ke[1]);
        }
    }
}
