
package Tugas7;

public class Soal3 {
    static int hasilAkhir(int bulan, int tanggal) {
        return (bulan * 100) + tanggal;
    }

    public static void main(String[] args) {
        int bulan = 2;    // Februari
        int tanggal = 15;

        int hasil = hasilAkhir(bulan, tanggal);
        System.out.println("Hasil akhirnya = " + hasil);
    }

}
