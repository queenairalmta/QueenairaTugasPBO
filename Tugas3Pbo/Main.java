
package Tugas3;

import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {

        //no 1 menghitung gaji bersih
        MenghitungGajiBersih mg = new MenghitungGajiBersih();
        mg.MenghitungGajiBersih();
        mg.totalGaji();
        mg.pajakPenghasilan();
        mg.gajiBersih();
      
        //no 2 data input stream dan data output stream
        DataInputStream_DataOutputStream testIOS = new DataInputStream_DataOutputStream();
        testIOS.IOstream();
         
        //no 3 perbedaan scanner dan bufferreader 
        PerbedaanScanner_BufferReader test_input1 = new PerbedaanScanner_BufferReader();
        test_input1.contoh_scanner();
        
        PerbedaanScanner_BufferReader test_input2 = new PerbedaanScanner_BufferReader();
        test_input2.contoh_buffered();
        
        //no 4 menghitung gaya sentripetal 
        Sentripetal sp = new Sentripetal();
        sp.sentripetal();
        
        //no 5 menghitung total buah yang dibeli
        BuahBufferedReader bhr = new BuahBufferedReader();
        bhr.buah();
        
        //no 6 selisih waktu
        SelisihWaktu sw = new SelisihWaktu();
        sw.hitungSW();
        
        //no 7 percetakan novel
        PercetakanNovel pn = new PercetakanNovel();
        pn.waktu();
    }

}
