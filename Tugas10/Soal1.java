
package Tugas10;

class Bentuk{
    
    float luas;
    
    void luas(){
        System.out.print("Menghitung luas: "); 
    }   
}

class PersegiPanjang extends Bentuk{
    
    float panjang, lebar;
    
    public PersegiPanjang(float panjang, float lebar){
        this.panjang= panjang;
        this.lebar=lebar;
    }
    
    @Override
    public void luas(){
        System.out.println("Panjang: "+panjang);
        System.out.println("Lebar: "+lebar);
        luas = panjang * lebar;
        System.out.println("Luas persegi panjang dengan panjang "+panjang+" dan lebar "+lebar+" adalah "+super.luas);
    }
}

class BujurSangkar extends Bentuk{
    float sisi;

    public BujurSangkar(float sisi) {
        this.sisi = sisi;
    }
    
    @Override
    void luas(){
        System.out.println("Sisi "+sisi);
        luas = sisi * sisi;
        System.out.println("Luas bujur sangkar: "+luas);
    }
}

class Segitiga extends Bentuk{
    
    float alas, tinggi;
    
    public Segitiga(float alas, float tinggi){
       this.alas=alas;
       this.tinggi=tinggi;
    }
    
    @Override
    public void luas(){
        System.out.println("Alas: "+alas);
        System.out.println("Tinggi: "+tinggi);
        luas = 0.5f * alas * tinggi;
        System.out.println("Luas segitiga dengan alas "+alas+" dan tinggi "+tinggi+" adalah "+super.luas);
    }
}

class Lingkaran extends Bentuk{
    float r;
    
    public Lingkaran(float r){
        this.r=r;
    }
    
    @Override
    public void luas(){
        System.out.println("Jari-jari(r): "+r);
        super.luas = 3.14f * r * r ;
        System.out.println("Luas lingkaran dengan jari jari "+r+" adalah "+super.luas);
    }
}

public class Soal1 {
    public static void main(String[] args) {
       PersegiPanjang ppl = new PersegiPanjang(8, 4);
       ppl.luas();
       System.out.println();
       BujurSangkar bs = new BujurSangkar(6);
       bs.luas();
       System.out.println();
       Segitiga s = new Segitiga(12, 4);
       s.luas();
       System.out.println();
       Lingkaran l = new Lingkaran(4);
       l.luas();
       System.out.println();
    }
}
