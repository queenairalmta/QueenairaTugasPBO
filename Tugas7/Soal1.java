
package Tugas7;

class Mahasiswa {
    String nama;

    void tampil() {
        System.out.println("Nama Mahasiswa: " + nama);
    }
}

public class Soal1 {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa(); // objek dibuat
        mhs.nama = "Budi";               // memberi nilai
        mhs.tampil();                    // memanggil method
    }
}

