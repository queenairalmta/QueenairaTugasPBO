
package Tugas10;

abstract class Produk6{
    String judul, penulis;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    
    String getInfoproduk(){
        return "Judul: "+getJudul()+"\nPenulis: "+getPenulis();
    }
}

class Komik6 extends Produk6{
    int jumlah_halaman;

    public int getJumlah_halaman() {
        return jumlah_halaman;
    }

    public void setJumlah_halaman(int jumlah_halaman) {
        this.jumlah_halaman = jumlah_halaman;
    }
    
    String getInfoProduk(){
        return "Info produk komik\n" +super.getInfoproduk() + "\nJumlah Halaman: " + getJumlah_halaman();
    }
}

class Games6 extends Produk6{
    int waktu_main;

    public int getWaktu_main() {
        return waktu_main;
    }

    public void setWaktu_main(int waktu_main) {
        this.waktu_main = waktu_main;
    }
    
    String getInfoProduk(){
        return "Info produk games\n" +super.getInfoproduk() + "\nWaktu main: " + getWaktu_main()+ " menit";
    }
}

public class Soal6 {
    public static void main(String[] args) {
        Komik6 pk6 = new Komik6();
        pk6.setJudul("Gundala");
        pk6.setPenulis("Hasmi");
        pk6.setJumlah_halaman(104);
        System.out.println(pk6.getInfoProduk());
        System.out.println();
        
        Games6 pg6= new Games6();
        pg6.setJudul("Farm merge valley");
        pg6.setPenulis("Zynga");
        pg6.setWaktu_main(60);
        System.out.println(pg6.getInfoProduk());
        System.out.println();
    }
}
