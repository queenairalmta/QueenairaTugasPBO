
package Tugas2;


public class Segitiga {
    int a,b;           //a tinggi, b alas, c sisi miring  
    double luas,c,keliling;     

    public Segitiga(int a,int b) {
        this.a=a;
        this.b=b;
    }
    
    void luas_se(){
        luas= 0.5*a*b;
        System.out.println("tinggi: "+a);
        System.out.println("alas: "+b);
        System.out.println("hasil luas: "+luas);
    }
    
    void keliling(){    //rumus phythagoras
        c  = Math.sqrt(a*a+b*b);     //untuk mencari sisi miring
        keliling = a+b+c;
        System.out.println("Sisi miring: "+c);
        System.out.println("Keliling segitiga: "+keliling);
    }
}
