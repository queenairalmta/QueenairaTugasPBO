
package Tugas6;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = in.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int kolom = in.nextInt();

        int[][] matriks = new int[baris][kolom];

        System.out.println("\nMasukkan element matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("M[" + i + "][" + j + "] = ");
                matriks[i][j] = in.nextInt();
            }
        }

        int total = 0;
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                total += matriks[i][j];
            }
        }

        System.out.println("\nTotal penjumlahan semua element: " + total);
    }

}
