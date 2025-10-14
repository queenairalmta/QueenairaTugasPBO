
package Tugas2;


public class MengubahString {
   String a,b;

    public MengubahString(String a,String b) {
        this.a=a;
        this.b=b;
    }
    
    void tampil_hasil(){
        System.out.println("Teks asli: "+a);
        System.out.println("Hasil lowercase: "+a.toLowerCase()); //build in methode jsvs
        System.out.println("Teks asli: "+b);
        System.out.println("Hasil lowercase: "+a.toUpperCase());       
    } 
}
