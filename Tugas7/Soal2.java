
package Tugas7;

public class Soal2 {
    static int hitungKeliling(int p, int l) {
        return 2 * (p + l);
    }
    
    public static void main(String[] args) {
        int panjang = 10;
        int lebar = 5;

        int keliling = hitungKeliling(panjang, lebar);
        System.out.println("Keliling = " + keliling);
    }
}
