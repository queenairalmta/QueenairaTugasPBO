
package Tugas9;

class Macam{
    
    void jenis(){
        System.out.println("Macam-macam hewan: ");
    }
}

class hKaki2 extends Macam{
    void jenis(){
        System.out.println("- hewan berkaki dua: kangguru, ayam, bebek, dll");
    }
}

class hKaki6 extends Macam{
    void jenis(){
        System.out.println("- hewan berkaki enam: capung, nyamuk, kupu-kupu, dll");
    }
}

class hKaki4 extends Macam{
    void jenis(){
        System.out.println("- hewan berkaki empat: kucing, anjing, kuda, dll");
    }
}

class hKaki8 extends Macam{
    void jenis(){
        System.out.println("- hewan berkaki delapan: kepiting, belalang, laba-laba, dll");
    }
}

public class Soal1 {
    public static void main(String[] args) {
        Macam m = new Macam();
        m.jenis();
        
        hKaki2 h2 = new hKaki2();
        h2.jenis();
        
        hKaki6 h6 = new hKaki6();
        h6.jenis();
        
        hKaki4 h4 = new hKaki4();
        h4.jenis();
        
        hKaki8 h8 = new hKaki8();
        h8.jenis();
        System.out.println();
    }
}
