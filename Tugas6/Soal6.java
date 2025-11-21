
package Tugas6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Masukkan jumlah bilangan: ");
            int n = sc.nextInt();

            double[] arr = new double[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Input bilangan ke-" + i + ": ");
                arr[i] = sc.nextDouble();
            }

            double total = 0;
            for (double x : arr) total += x;

            System.out.println("Rata-rata = " + (total / n));

        } catch (Exception e) {
            System.out.println("Input harus angka!");
        }
    }


}
