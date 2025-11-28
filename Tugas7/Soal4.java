
package Tugas7;

class SumpahPemuda {

    // constructor
    public SumpahPemuda() {
        System.out.println("Kami putra dan putri Indonesia");
    }

    // Method
    void tampilkanSumpah() {
        System.out.println("Mengaku bertumpah darah yang satu, tanah Indonesia");
        System.out.println("Mengaku berbangsa yang satu, bangsa Indonesia");
        System.out.println("Menjunjung bahasa persatuan, bahasa Indonesia");
    }
}

public class Soal4 {
    public static void main(String[] args) {
        SumpahPemuda sp = new SumpahPemuda();
        sp.tampilkanSumpah();
    }

}
