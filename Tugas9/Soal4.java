
package Tugas9;

class Hewan{
    String nama;
    
    void makan(){
        System.out.println(nama +" sedang makan");
    }
}

class Kucing extends Hewan{
    
    String display(){
        return nama;
    }
}

public class Soal4 {
    public static void main(String[] args) {
      Kucing k = new Kucing();
      k.nama = "kucing";
      k.makan();
      System.out.println();  
    } 
}
