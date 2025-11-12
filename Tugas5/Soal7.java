
package Tugas5;

public class Soal7 {
    public static void main(String[] args) {
        int i = 0;

        System.out.println("Menggunakan i++ :"); //nilai ditampilkan dulu, baru ditambah
        while (i < 5) {
            System.out.println(i++);
        }

        i = 0;
        System.out.println("\nMenggunakan ++i :"); //nilai ditambah dulu, baru ditampilkan
        while (i < 5) {
            System.out.println(++i);
        }
    }

}
