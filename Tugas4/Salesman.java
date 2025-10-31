
package Tugas4;

import java.util.Scanner;

public class Salesman {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double penjualan, uangJasa = 0, komisi = 0, totalPendapatan;

        System.out.print("Masukkan total penjualan hari ini (Rp): ");
        penjualan = input.nextDouble();

        if (penjualan <= 2000000) {
            uangJasa = 100000;
            komisi = 0.10 * penjualan;
        } else if (penjualan > 2000000 && penjualan <= 5000000) {
            uangJasa = 200000;
            komisi = 0.15 * penjualan;
        } else if (penjualan > 5000000) {
            uangJasa = 300000;
            komisi = 0.20 * penjualan;
        }

        totalPendapatan = uangJasa + komisi;

        System.out.println("\n=== Laporan Pendapatan Salesman ===");
        System.out.println("Total Penjualan   : Rp" + penjualan);
        System.out.println("Uang Jasa         : Rp" + uangJasa);
        System.out.println("Komisi            : Rp" + komisi);
        System.out.println("------------------------------------");
        System.out.println("Total Pendapatan  : Rp" + totalPendapatan);
    }


}
