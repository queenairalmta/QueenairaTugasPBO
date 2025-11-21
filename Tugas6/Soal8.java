
package Tugas6;

class Program extends Thread {
    int id;

    Program(int id) { 
        this.id = id; 
    }

    public void run() {
        System.out.println("Thread ke-" + id + " berjalan");
    }
}

public class Soal8 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {  // bebas, bisa ubah jumlah thread
            Program t = new Program(i);
            t.start();
        }
    }
}


