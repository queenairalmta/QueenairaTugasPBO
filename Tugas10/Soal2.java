
package Tugas10;

interface DataUniv{
    void tampildata();
}

class DataUnivImplement implements DataUniv{
    
    String namaUniv, alamat, prov, negara, telepon;

    public DataUnivImplement(String namaUniv, String alamat, String prov, String negara, String telepon) {
        this.namaUniv = namaUniv;
        this.alamat = alamat;
        this.prov = prov;
        this.negara = negara;
        this.telepon = telepon;
    }
    
    @Override
    public void tampildata() {
        System.out.println("Nama Universitas\t: "+namaUniv);
        System.out.println("Alamat\t\t\t: "+alamat);
        System.out.println("Telepon\t\t\t: "+telepon);
        System.out.println("Provinsi\t\t: "+prov);
        System.out.println("Negara\t\t\t: "+negara);
    }   
}

public class Soal2 {
    public static void main(String[] args) {
       DataUnivImplement d = new DataUnivImplement("Universitas Suryakancana", "Pasir Gede", "Jawa-Barat", "Indonesia", "08123-3210-3123");
       d.tampildata();
       System.out.println();
    }
}
