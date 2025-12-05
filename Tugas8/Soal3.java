
package Tugas8;

class Konversi {
    String keBiner(int n) {
        return Integer.toBinaryString(n);
    }
}

public class Soal3 {
     public static void main(String[] args) {
        Konversi k = new Konversi();
        System.out.println("Biner: " + k.keBiner(10));
    }
}
