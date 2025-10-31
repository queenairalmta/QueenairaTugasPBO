
package Tugas4;

import java.util.Scanner;

public class MenghitungLuas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); {
            int pilihan;
            double luas = 0;
            
            System.out.println("=== Program Luas Bangun Datar ===");
            System.out.println("1. Persegi");
            System.out.println("2. Segitiga");
            System.out.println("3. Lingkaran");
            System.out.println("4. Trapesium");
            System.out.println("5. Layang-layang");
            System.out.print("Pilih bangun datar (1-5): ");
            pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan sisi: ");
                    double sisi = input.nextDouble();
                    luas = sisi * sisi;
                }
                    
                case 2 -> {
                    System.out.print("Masukkan alas: ");
                    double alas = input.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = input.nextDouble();
                    luas = 0.5 * alas * tinggi;
                }
                    
                case 3 -> {
                    System.out.print("Masukkan jari-jari: ");
                    double r = input.nextDouble();
                    luas = 3.14 * r * r;
                }
                    
                case 4 -> {
                    System.out.print("Masukkan sisi atas: ");
                    double atas = input.nextDouble();
                    System.out.print("Masukkan sisi bawah: ");
                    double bawah = input.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggiTrap = input.nextDouble();
                    luas = 0.5 * (atas + bawah) * tinggiTrap;
                }
                    
                case 5 -> {
                    System.out.print("Masukkan diagonal 1: ");
                    double d1 = input.nextDouble();
                    System.out.print("Masukkan diagonal 2: ");
                    double d2 = input.nextDouble();
                    luas = 0.5 * d1 * d2;
                }
                    
                default -> {
                    System.out.println("Pilihan tidak valid!");
                    System.exit(0);
                }
            }
            
            System.out.println("Luas bangun datar = " + luas);
        }
    }

 
}
