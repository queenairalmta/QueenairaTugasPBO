
package Tugas4;

import java.util.Scanner;

public class GajiBersih {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIK: ");
        String NIK = input.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Kode Golongan (1-4): ");
        int golongan = input.nextInt();
        System.out.print("Masukkan Jumlah Anak: ");
        int jumlahAnak = input.nextInt();

        double gajiPokok = 0, tunjanganPasangan = 0, tunjanganAnak = 0, gajiBersih;

        switch (golongan) {
            case 1:
                gajiPokok = 1200000;
                tunjanganPasangan = 0.1 * gajiPokok;
                break;
            case 2:
                gajiPokok = 1500000;
                break;
            case 3:
                gajiPokok = 1750000;
                break;
            case 4:
                gajiPokok = 2000000;
                tunjanganPasangan = 0.1 * gajiPokok;
                tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;
                break;
            default:
                System.out.println("Kode golongan tidak valid!");
                return;
        }

        gajiBersih = gajiPokok + tunjanganPasangan + tunjanganAnak;

        System.out.println("\n=== Slip Gaji Karyawan ===");
        System.out.println("NIK           : " + NIK);
        System.out.println("Nama          : " + nama);
        System.out.println("Golongan      : " + golongan);
        System.out.println("Gaji Pokok    : Rp" + gajiPokok);
        System.out.println("Tunj. Pasangan: Rp" + tunjanganPasangan);
        System.out.println("Tunj. Anak    : Rp" + tunjanganAnak);
        System.out.println("Gaji Bersih   : Rp" + gajiBersih);
    }
  
}
