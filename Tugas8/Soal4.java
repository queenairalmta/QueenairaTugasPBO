
package Tugas8;

class Kasir {
    int harga, jumlah;
    double diskon, total;

    // Jika hanya harga
    Kasir(int harga) {
        this.harga = harga;
        this.total = harga;
    }

    // Jika harga dan jumlah
    Kasir(int harga, int jumlah) {
        this.harga = harga;
        this.jumlah = jumlah;
        this.total = harga * jumlah;
    }

    // Jika lengkap
    Kasir(int harga, int jumlah, double diskon) {
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = diskon;
        this.total = harga * jumlah - (harga * jumlah * diskon / 100);
    }

    void tampil() {
        System.out.println("Total Bayar = " + total);
    }
}

public class Soal4 {
    public static void main(String[] args) {
        Kasir k1 = new Kasir(5000);
        Kasir k2 = new Kasir(5000, 3);
        Kasir k3 = new Kasir(5000, 3, 10);

        k1.tampil();
        k2.tampil();
        k3.tampil();
    }
}
