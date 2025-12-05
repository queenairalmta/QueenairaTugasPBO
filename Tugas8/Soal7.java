
package Tugas8;

class Barisan {
    void tampil(int[] data) {
        for (int i : data) {
            System.out.print(i + " ");
        }
    }
}

public class Soal7 {
    public static void main(String[] args) {
        int[] angka = {6, 12, 24, 48, 96};

        Barisan b = new Barisan();
        b.tampil(angka);
    }
}
