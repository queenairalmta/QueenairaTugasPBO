
package Tugas7;

import java.util.Scanner;

class Mahasiswa {
    String nama;
    String npm;
    String kelas;

    Mahasiswa(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    void tampil() {
        System.out.println("Nama  : " + nama);
        System.out.println("NPM   : " + npm);
        System.out.println("Kelas : " + kelas);
    }
}

public class Soal7 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Nama  : ");
        String nama = in.nextLine();

        System.out.print("Masukkan NPM   : ");
        String npm = in.nextLine();

        System.out.print("Masukkan Kelas : ");
        String kelas = in.nextLine();

        Mahasiswa mhs = new Mahasiswa(nama, npm, kelas);
        mhs.tampil();
    }
}
