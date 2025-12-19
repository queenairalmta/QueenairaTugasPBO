
package Tugas10;

class Produk3{
    String judul, penulis;
    
    String getInfoproduk(){
        return "Judul: "+judul+"\nPenulis: "+penulis;
    }
}

class Komik3 extends Produk3{
    
    int jumlah_halaman;
    
    String getInfoProduk(){ 
        return "Info produk komik\n" + super.getInfoproduk()+" \n"+"Jumlah halaman: "+jumlah_halaman;
    }
}

class Games3 extends Produk3{
    
    int waktu_main;
    
    String getInfoProduk(){
        return "Info produk games\n" + super.getInfoproduk()+" \n"+"Waktu main: "+waktu_main+ " menit";
    }   
}

public class Soal3 {
    public static void main(String[] args) {
        Komik3 pk = new Komik3();
        pk.jumlah_halaman = 104;
        pk.judul="Gundala";
        pk.penulis= "Hasmi";
        System.out.println(pk.getInfoProduk());
        System.out.println();
        Games3 pg = new Games3();
        pg.waktu_main = 60;
        pg.judul="Farm merge valley";
        pg.penulis= "Zynga";
        System.out.println(pg.getInfoProduk());
        System.out.println();
    }
}
