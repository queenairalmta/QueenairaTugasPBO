
package Tugas6;

class KelasThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread berjalan yaa!");
    }
}

public class Soal7 {
    public static void main(String[] args) {
        KelasThread t = new KelasThread();
        t.start(); //memulai thread
    }
}
