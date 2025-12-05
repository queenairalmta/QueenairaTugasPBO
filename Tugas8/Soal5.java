
package Tugas8;

class Persegi {
    int p, l;

    Persegi(int p, int l) {
        this.p = p;
        this.l = l;
    }

    int luas() {
        return p * l;
    }
}

class Hitung {
    int luasHitam(Persegi besar, Persegi kecil) {
        return besar.luas() - kecil.luas();
    }
}

public class Soal5 {
    public static void main(String[] args) {
        Persegi besar = new Persegi(10, 5);
        Persegi kecil = new Persegi(8, 4);

        Hitung h = new Hitung();
        System.out.println("Luas Hitam = " + h.luasHitam(besar, kecil));
    }
}
