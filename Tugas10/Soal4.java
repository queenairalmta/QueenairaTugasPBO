
package Tugas10;

class Produk4{
    protected String judul, penulis;
    
    Produk4(String judul, String penulis){
        this.judul=judul;
        this.penulis=penulis;
    }
    
    String getInfoproduk(){
        return "Judul: "+judul+"\nPenulis: "+penulis;
    }
}

class Komik4 extends Produk4{    
    int jumlah_halaman;
    
    Komik4(int jumlah_halaman, String judul,String penulis){
        super(judul,penulis);
        this.jumlah_halaman=jumlah_halaman;
    }
    
    String getInfoProduk(){
        return "Info produk komik\n" + super.getInfoproduk()+" \n"+"Jumlah halaman: "+jumlah_halaman;
    }
}

class Games4 extends Produk4{    
    int waktu_main;
    
    Games4(int waktu_main, String judul,String penulis){
        super(judul,penulis);
        this.waktu_main=waktu_main;
    }
    
    String getInfoProduk(){
        return "Info produk games\n" + super.getInfoproduk()+" \n"+"Waktu main: "+waktu_main+ " menit";
    }   
}

public class Soal4 {
    public static void main(String[] args) {
        Komik4 pk4 = new Komik4(104, "Gundala", "Hasmi");
        System.out.println(pk4.getInfoProduk());
        System.out.println();
        Games4 pg4 = new Games4(60, "Farm merge valley", "Zynga");
        System.out.println(pg4.getInfoProduk());
        System.out.println();

    }
}
