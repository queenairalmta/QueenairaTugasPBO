
package Tugas9;

class Produk{
    String judul, penulis;
    
    Produk(String judul, String penulis){
        this.judul=judul;
        this.penulis=penulis;
    }
}

class Komik extends Produk{
    
    Komik(String judul,String penulis){
        super(judul,penulis);
    }
    
    void getInfoProduk(){
        System.out.println("Info Produk Komik: ");
        System.out.println("Judul: "+super.judul);
        System.out.println("Penulis: "+super.penulis);
    }
}

class Games extends Produk{
    
    Games(String judul,String penulis){
        super(judul,penulis);
    }
    void getInfoProduk(){
        System.out.println("Info Produk Games: ");
        System.out.println("Judul: "+super.judul);
        System.out.println("Penulis: "+super.penulis);
    }
    
}

public class Soal5 {
   public static void main(String[] args) {
       Komik ko = new Komik("Simple Thinking About Blood Type", "Park Dong Sun");
       ko.getInfoProduk();
       Games ga = new Games("Mobile Legends", "Moonton");
       ga.getInfoProduk();
       System.out.println();
    } 
}
