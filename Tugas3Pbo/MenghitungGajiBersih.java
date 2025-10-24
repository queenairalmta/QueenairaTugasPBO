
package Tugas3;

import java.util.Scanner;

public class MenghitungGajiBersih {
    double nik, gaji_pokok, tunjangan_jabatan, tunjangan_istri, tunjangan_anak;
    String nama, alamat, jabatan;
    double total_gaji, pajak_penghasilan, gaji_bersih;
    Scanner in = new Scanner(System.in);
    
    void MenghitungGajiBersih(){
        
        System.out.print("Nomor induk karyawan\t: ");
        nik = in.nextDouble();
        in.nextLine(); //getline
        System.out.print("Nama karyawan\t\t: ");
        nama = in.nextLine();
        System.out.print("Alamat\t\t\t: ");
        alamat=in.nextLine();
        System.out.print("Jabatan\t\t\t: ");
        jabatan=in.nextLine();
        System.out.print("Gaji pokok\t\t: ");
        gaji_pokok= in.nextDouble();
        System.out.print("Tunjangan jabatan\t: ");
        tunjangan_jabatan= in.nextDouble();
        System.out.print("Tunjangan istri\t\t: ");
        tunjangan_istri= in.nextDouble();
        System.out.print("Tunjangan anak\t\t: ");
        tunjangan_anak= in.nextDouble();
        
    }
    
    double totalGaji(){
        total_gaji = gaji_pokok+tunjangan_jabatan+tunjangan_istri+tunjangan_anak;
        System.out.println("Total gaji\t\t: "+total_gaji);
        return total_gaji;
    }
    double pajakPenghasilan(){
        double pajak_penghasilan = 0.1 * (gaji_pokok+tunjangan_jabatan+tunjangan_anak);
        System.out.println("Pajak penghasilan\t: "+pajak_penghasilan);
        return pajak_penghasilan;
    }
    double gajiBersih(){
        double pajak_penghasilan = 0;
        gaji_bersih = total_gaji - pajak_penghasilan;
        System.out.println("Gaji bersih\t\t: "+gaji_bersih);
        return gaji_bersih;
    }

}
