
package Tugas8;

import java.util.Scanner;

class Faktorial {
    int hitung(int n) {
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }
}

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Faktorial f = new Faktorial();

        System.out.print("Masukkan angka: ");
        int n = input.nextInt();

        System.out.println("Faktorial = " + f.hitung(n));
    }

}
