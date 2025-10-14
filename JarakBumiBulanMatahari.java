
package Tugas2;


public class JarakBumiBulanMatahari {
    double jarak_bulan,jarak_matahari, kecepatan;
    
    public JarakBumiBulanMatahari(double jarak_bulan,double jarak_matahari, double kecepatan) {
        this.jarak_bulan=jarak_bulan;
        this.jarak_matahari=jarak_matahari;
        this.kecepatan=kecepatan;
    }
    
    void waktu_tempuh(){
        double waktu_bulan= jarak_bulan/kecepatan;
        double waktu_matahari=jarak_matahari/kecepatan;
        System.out.println("Waktu tempuh dari bumi ke bulan: "+waktu_bulan);
        System.out.println("Waktu tempuh dari bumi ke matahari: "+waktu_matahari);
    }
}
