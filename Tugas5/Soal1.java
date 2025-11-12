
package Tugas5;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil, terbesar, terkecil;

        System.out.print("Masukkan bilangan ke-1: ");
        bil = input.nextInt();
        terbesar = bil;
        terkecil = bil;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            bil = input.nextInt();
            if (bil > terbesar) terbesar = bil;
            if (bil < terkecil) terkecil = bil;
        }

        System.out.println("Bilangan terbesar = " + terbesar);
        System.out.println("Bilangan terkecil = " + terkecil);
    }
    
}
