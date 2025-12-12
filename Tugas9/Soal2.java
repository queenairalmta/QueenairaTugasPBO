
package Tugas9;

class Segitiga{
    protected double alas, tinggi;
    
    protected Segitiga(double alas, double tinggi){
        this.alas= alas;
        this.tinggi = tinggi;
    }
    
    protected void hitungLuas(){
        double luas = 0.5 * alas * tinggi;
        System.out.println("Hasil luas segitiga dengan alas "+alas+" tinggi "+tinggi+" adalah "+luas);
    }
}

public class Soal2 {
    public static void main(String[] args) {
        Segitiga s = new Segitiga(5,5);
        s.hitungLuas();
        System.out.println();
    }
}
