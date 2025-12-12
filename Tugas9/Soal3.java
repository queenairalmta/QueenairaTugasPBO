
package Tugas9;

class HitungVkubus{
    
    private int sisi;
    public int volume;
    
    void setSisi(int sisi){
        this.sisi = sisi;
    }
    
    int getSisi(){
        return sisi;
    }
    
    void hitungV(){
        volume = sisi * sisi *sisi;
        System.out.println("Volume kubus dengan sisi "+sisi+" adalah "+volume);
    }
    
}

public class Soal3 {
    public static void main(String[] args) {
        HitungVkubus v = new HitungVkubus();
        v.setSisi(5);
        v.hitungV();
        System.out.println();
    }
}
