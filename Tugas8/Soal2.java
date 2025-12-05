
package Tugas8;

class Pangkat {
    int hitung(int a, int b) {
        int hasil = 1;
        for (int i = 1; i <= b; i++) {
            hasil *= a;
        }
        return hasil;
    }
}

public class Soal2 {
    public static void main(String[] args) {
        Pangkat p = new Pangkat();
        System.out.println("Hasil = " + p.hitung(2, 5));
    }
}
