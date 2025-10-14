
package Tugas2;


public class OperasiMatematika {
    double x;
    double y;
    double hasil;
    
    public OperasiMatematika(double x,double y) {
        this.x=x;
        this.y=y;
    }
    
    void penjumlahan(){
        hasil = x + y;
        System.out.println("Hasil penjumlahan dari "+x+" dan "+ y+" :"+hasil);  
    }
    void pengurangan(){
        hasil = x - y;
        System.out.println("Hasil pengurangan dari "+x+" dan "+ y+" :"+hasil);  
    }
    void perkalian(){
        hasil = x * y;
        System.out.println("Hasil perkalian dari "+x+" dan "+ y+" :"+hasil);  
    }
    void pembagian(){
        hasil = x / y;
        System.out.println("Hasil pembagian dari "+x+" dan "+ y+" :"+hasil);  
    }
}
