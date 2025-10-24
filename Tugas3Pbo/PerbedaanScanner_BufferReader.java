
package Tugas3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;     //untuk mengecek error inputan buffered
import java.util.Scanner;

//Scanner lebih mudah digunakan (langsung bisa baca tipe data seperti int, double, dll)
//namun lebih lambat (karena parsing data otomatis) cocok digunakan untuk input sederhana dari user
//Sedangkan BufferReader harus membaca dalam bentuk String, lalu dikonversi manual
//lebih cepat (karena hanya membaca teks mentah) dan cocok digunakan untuk input besar atau data file

public class PerbedaanScanner_BufferReader {
    Scanner inS = new Scanner(System.in);   //dalam kurung bisa langsung system.in
    BufferedReader inB = new BufferedReader(new InputStreamReader(System.in)); // bufferead masih butuh penyangga
    
    void contoh_scanner(){
        //bisa semua tipe data dan next.. 
        int npm;
        String nama;
        
        System.out.println("Test Scanner");
        //cara penggunaannya dilakukan dengan memanggil objek input yang sudah dibuat inS
        System.out.print("Masukan npm: ");
        npm = inS.nextInt(); //setelah next menyesuaikan dengan tipe data yang digunakan kecuali string yaitu menggunakan line
        inS.nextLine();
        
        System.out.print("Masukan nama: ");
        nama = inS.nextLine();
        System.out.println();
    }
    
    void contoh_buffered() throws IOException{
        //hanya bisa line dan toString
        //harus dikonversi
        
        int umur;
        String nama;
        char kelas;
        
        System.out.println("Test BufferReader");
        System.out.print("Masukan nama: ");
        nama = inB.readLine();        
     
        System.out.print("Masukan umur: ");
        umur = Integer.parseInt(inB.readLine());
        
        System.out.print("Masukan kelas: ");
        kelas = inB.readLine().charAt(0); 
        
    }
}
