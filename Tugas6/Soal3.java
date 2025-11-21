
package Tugas6;

import java.util.Arrays;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // input elemen
        for (int i = 0; i < n; i++) {
            System.out.print("Input elemen ke-" + i + ": ");
            arr[i] = sc.nextInt();
        }

        // cari nilai max & min
        int max = arr[0], min = arr[0];
        int idxMax = 0, idxMin = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) { max = arr[i]; idxMax = i; }
            if (arr[i] < min) { min = arr[i]; idxMin = i; }
        }

        System.out.println("Nilai terbesar = " + max + ", indeks = " + idxMax);
        System.out.println("Nilai terkecil = " + min + ", indeks = " + idxMin);

        // rata-rata
        double total = 0;
        for (int x : arr) total += x;

        double rata = total / n;
        System.out.println("Rata-rata = " + rata);

        // jumlah indeks ganjil
        int jmlGanjil = 0;
        for (int i = 1; i < n; i += 2)
            jmlGanjil += arr[i];

        // jumlah indeks genap
        int jmlGenap = 0;
        for (int i = 0; i < n; i += 2)
            jmlGenap += arr[i];

        System.out.println("Jumlah indeks ganjil = " + jmlGanjil);
        System.out.println("Jumlah indeks genap = " + jmlGenap);

        // cek total
        int cek = jmlGanjil + jmlGenap;
        System.out.println("Total = " + cek);
        System.out.println("Bilangan tersebut adalah " + (cek % 2 == 0 ? "Genap" : "Ganjil"));

        // sorting
        Arrays.sort(arr);
        System.out.println("Array setelah diurutkan: " + Arrays.toString(arr));
    }


}
