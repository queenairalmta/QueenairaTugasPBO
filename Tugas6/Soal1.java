
package Tugas6;

public class Soal1 {
    public static void main(String[] args) {

        int[] angka1 = new int[5];
        angka1[0] = 10;
        angka1[1] = 20;
        angka1[2] = 30;
        angka1[3] = 40;
        angka1[4] = 50;

        int[] angka2 = {1, 2, 3, 4, 5};

        int[] angka3 = new int[]{6, 7, 8, 9, 10};

        System.out.println("Variasi 1:");
        for (int a : angka1) {
            System.out.print(a + " ");
        }

        System.out.println("\n\nVariasi 2:");
        for (int a : angka2) {
            System.out.print(a + " ");
        }

        System.out.println("\n\nVariasi 3:");
        for (int a : angka3) {
            System.out.print(a + " ");
        }
    

        System.out.println("\nTiga variasi syntax array integer berhasil dibuat!");
    }

}
