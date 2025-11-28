
package Tugas7;

public class Soal5 {
    static int faktorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int hasil = faktorial(5);
        System.out.println("Faktorial 5 = " + hasil);
    }
}
