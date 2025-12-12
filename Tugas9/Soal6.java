
package Tugas9;

class Produk6{
    String judul, penulis;
    
    Produk6(String judul, String penulis){
        this.judul=judul;
        this.penulis=penulis;
    }
}

class Komik6 extends Produk6{
    int jumlah_halaman;
    
    Komik6(int jumlah_halaman, String judul,String penulis){
        super(judul,penulis);
        this.jumlah_halaman=jumlah_halaman;
    }
    
    void getInfoProduk(){
        System.out.println("Info Produk Komik: ");
        System.out.println("Jumlah halaman: "+ jumlah_halaman);
        System.out.println("Judul: "+super.judul);
        System.out.println("Penulis: "+super.penulis);
    }
}

class Games6 extends Produk6{
    
    int waktu_main;
    
    Games6(int waktu_main, String judul,String penulis){
        super(judul,penulis);
        this.waktu_main=waktu_main;
    }
    void getInfoProduk(){
        System.out.println("Info Produk Games: ");
        System.out.println("Waktu main: "+ waktu_main+ " menit");
        System.out.println("Judul: "+super.judul);
        System.out.println("Penulis: "+super.penulis);
    }
    
}

public class Soal6 {
    public static void main(String[] args) {
        Komik6 k6 = new Komik6(194,"Simple Thinking About Blood Type", "Park Dong Sun");
        k6.getInfoProduk();
        Games6 g6 = new Games6(60,"Mobile Legends", "Moonton");
        g6.getInfoProduk();
    }
}
