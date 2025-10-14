
package Tugas2;


public class KonversiSuhu {
    double c,f,r;   //celcius, fahrenheit, reamur

    public KonversiSuhu(double c, double f,double r ) {
    
        this.c=c;
        this.f=f;
        this.r=r;
    }
    
    double cToF(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }

    double fToC(double f) {
        return (f - 32.0) * 5.0 / 9.0;
    }

    double cToR(double c) {
        return c * 4.0 / 5.0;
    }

    double rToC(double r) {
        return r * 5.0 / 4.0;
    }

    double fToR(double f) {
        return (f - 32.0) * 4.0 / 9.0;
    }

    double rToF(double r) {
        return r * 9.0 / 4.0 + 32.0;
    }
    
    void tampilkanSemuaKonversi() {
        System.out.println("Nilai awal:");
        System.out.println("C = " + c);
        System.out.println("F = " + f);
        System.out.println("R = " + r);
        System.out.println();

        System.out.println("Konversi Celcius -> Fahrenheit = " + cToF(c));
        System.out.println("Konversi Fahrenheit -> Celcius = " + fToC(f));
        System.out.println();

        System.out.println("Konversi Celcius -> Reamur = " + cToR(c));
        System.out.println("Konversi Reamur -> Celcius = " + rToC(r));
        System.out.println();
        
        System.out.println("Konversi Fahrenheit -> Reamur = " + fToR(f));
        System.out.println("Konversi Reamur -> Fahrenheit = " + rToF(r));
        System.out.println();
    }
}
