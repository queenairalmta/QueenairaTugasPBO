
package Tugas2;


public class Main {
    public static void main(String[] args) {
        
        //tugas soal no 1 increment
        Increment incre = new Increment(7,7);
        
        incre.pre_increment();
        System.out.println();
        incre.post_increment();
        System.out.println();
        
        //tugas soal no 2 persegi panjang
        PersegiPanjang prsg = new PersegiPanjang(50,45);
        prsg.hitung_luas();
        System.out.println();
        
        //tugas soal no 3 persamaan kuadrat
        PersamaanKuadrat pr = new PersamaanKuadrat(2, 10, 5);
        pr.hitung_perKuadrat();
        System.out.println();
                
        //tugas soal no 4 operasi matematika
        OperasiMatematika om = new OperasiMatematika(22, 33);
        om.penjumlahan();
        om.pengurangan();
        om.perkalian();
        om.pembagian();
        System.out.println();
        
        //tugas soal no 5 dan 6 Segitiga
        Segitiga sgt =new Segitiga(6, 8);
        sgt.luas_se();
        System.out.println();
        sgt.keliling();
        System.out.println();
        
        //tugas soal no 7
        MengubahString us = new MengubahString("Saya Belajar Java", "Saya Belajar Java");
        us.tampil_hasil();
        System.out.println();
        
        //tugas soal no 8
        JarakBumiBulanMatahari bbm = new JarakBumiBulanMatahari(384.400,152.1,300.000);
        bbm.waktu_tempuh();
        System.out.println();
        
        //tugas soal no 9
        KonversiSuhu ks = new KonversiSuhu(10, 15, 5);
        ks.tampilkanSemuaKonversi();
    }
}
