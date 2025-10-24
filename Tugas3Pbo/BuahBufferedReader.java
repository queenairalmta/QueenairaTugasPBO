
package Tugas3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuahBufferedReader {
    int mangga, jambu_pertetangga, tetangga, mangga_busuk,jambu;
    int total_jambu, total_buah;
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
            
    void buah() throws IOException{
        System.out.print("Masukan jumlah buah mangga\t\t:");
        mangga = Integer.parseInt(br.readLine());
        System.out.print("Masukan jumlah buah jambu pertetangga\t:");
        int jambuPertetangga= Integer.parseInt(br.readLine());
        System.out.print("Masukan jumlah tetangga\t\t\t:");
        tetangga = Integer.parseInt(br.readLine());
        System.out.print("Masukan jumlah buah mangga yang busuk\t:");
        mangga_busuk = Integer.parseInt(br.readLine());
        
        total_jambu = jambu * tetangga;
        total_buah = (mangga-mangga_busuk)+ total_jambu;
        
        System.out.println("Total buah: " + total_buah);
    }
}
