
package Tugas4;

import java.util.Scanner;

public class KasirSederhana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); {
            double totalBelanja, uangDiberikan, diskon = 0, totalBayar, kembalian;
            String member;
            System.out.print("Apakah memiliki kartu member? (ya/tidak): ");
            member = input.nextLine();
            System.out.print("Masukkan total belanja: Rp ");
            totalBelanja = input.nextDouble();
            // Logika if-else untuk menentukan diskon
            if (member.equalsIgnoreCase("ya")) {
                if (totalBelanja > 500000) {
                    diskon = 50000;
                } else if (totalBelanja > 100000) {
                    diskon = 15000;
                } else {
                    diskon = 0;
                }
            } else { // Tidak punya kartu member
                if (totalBelanja > 100000) {
                    diskon = 10000;
                } else {
                    diskon = 0;
                }
            }   totalBayar = totalBelanja - diskon;
            System.out.println("\n=== RINCIAN PEMBAYARAN ===");
            System.out.println("Total Belanja : Rp " + totalBelanja);
            System.out.println("Diskon        : Rp " + diskon);
            System.out.println("Total Bayar   : Rp " + totalBayar);
            System.out.print("\nMasukkan uang yang diberikan pembeli: Rp ");
            uangDiberikan = input.nextDouble();
            kembalian = uangDiberikan - totalBayar;
            System.out.println("Kembalian     : Rp " + kembalian);
            System.out.println("===========================");
            System.out.println("Terima kasih telah berbelanja!");
        }
    }

 
}
