
package Tugas6;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = inp.nextInt();
        inp.nextLine(); // buang enter

        String[] nama = new String[jumlah];
        int[] nilai = new int[jumlah];
        String[] status = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));

            System.out.print("Nama   : ");
            nama[i] = inp.nextLine();

            System.out.print("Nilai  : ");
            nilai[i] = inp.nextInt();
            inp.nextLine(); // buang enter

            if (nilai[i] <= 50)
                status[i] = "Tidak Lulus";
            else
                status[i] = "Lulus";
        }

        System.out.println("\n=================================================");
        System.out.println("               Daftar Nilai Mahasiswa         ");
        System.out.println("=================================================");
        System.out.printf("%-5s %-20s %-10s %-15s\n", "No", "Nama", "Nilai", "Status");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-5d %-20s %-10d %-15s\n", 
                              (i + 1), nama[i], nilai[i], status[i]);
        }

        System.out.println("=================================================");
    }

}
