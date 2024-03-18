package modul1202357201054;

import javax.swing.JOptionPane;

public class Modul1202357201054 {

    public static void main(String[] args) {
        int data[][] = {
            {4, 6, 4, 2, 8, 4, 2, 10},
            {4, 6, 4, 2, 8, 4, 2, 10}
        };
        System.out.println("Array Awal : ");
        for (int a = 0; a < data.length; a++) {
            double ratarata = 0.0;
            for (int b = 0; b < data[a].length; b++) {
                System.out.print(data[a][b] + " ");

                ratarata += data[a][b];

            }
            ratarata /= data[a].length;
            System.out.println("\nrata rata array = " + ratarata);
        }
        //b
        int nilaiDicari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai yang ingin dicari:"));
        boolean ditemukan = false;
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[a].length; b++) {
                if (data[a][b] == nilaiDicari) {
                    ditemukan = true;
                    JOptionPane.showMessageDialog(null, "Nilai" + nilaiDicari + " ditemukan pada indeks [" + a + "][" + b + "].");
                    int nilaiBaru = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai baru"));
                    data[a][b] = nilaiBaru;
                }
            }
        }
        if (!ditemukan) {
            JOptionPane.showMessageDialog(null, "Nilai " + nilaiDicari + " tidak di temukan dalam array.");
            System.out.println("\nArray Tidak Ada Perubahan, karena nilai array yang dicari tidak ada");
        }else {
            System.out.println("\nArray Setelah Perubahan:");
            for (int a = 0; a < data.length; a++) {
                for (int b = 0; b < data[a].length; b++) {
                    System.out.print(data[a][b] + " ");
                }
                System.out.println();
            }
        }
    }

}
