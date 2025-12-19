
package Tugas10;

class Produk5{
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

class Komik5 extends Produk5{
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

class Games5 extends Produk5{
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

public class Soal5 {
    public static void main(String[] args) {
        Komik5 pk5 = new Komik5();
        pk5.setJudul("Gundala");
        pk5.setPenulis("Hasmi");
        pk5.setJumlah_halaman(104);
        System.out.println(pk5.getInfoProduk());
        System.out.println();
        
        Games5 pg5 = new Games5();
        pg5.setJudul("Farm merge valley");
        pg5.setPenulis("Zynga");
        pg5.setWaktu_main(60);
        System.out.println(pg5.getInfoProduk());
        System.out.println();
    }
}
