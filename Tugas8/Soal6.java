
package Tugas8;

class Nilai {
    int a, b, c;

    Nilai(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double rataRata() {
        return (a + b + c) / 3.0;
    }
}

public class Soal6 {
    public static void main(String[] args) {
        Nilai n = new Nilai(80, 90, 85);
        System.out.println("Rata-rata = " + n.rataRata());
    }
}
