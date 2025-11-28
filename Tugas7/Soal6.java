
package Tugas7;

class Civitas {
    String nama;
    String status;

    void tampil() {
        System.out.println("Nama   : " + nama);
        System.out.println("Status : " + status);
    }
}

class Dosen extends Civitas {
    Dosen(String nama) {
        this.nama = nama;
        this.status = "Dosen";
    }
}

class Mahasiswa extends Civitas {
    Mahasiswa(String nama) {
        this.nama = nama;
        this.status = "Mahasiswa";
    }
}

class Staff extends Civitas {
    Staff(String nama) {
        this.nama = nama;
        this.status = "Staff";
    }
}

public class Soal6 {
    public static void main(String[] args) {
        Dosen d = new Dosen("Pak Budi");
        Mahasiswa m = new Mahasiswa("Ayu");
        Staff s = new Staff("Rina");

        d.tampil();
        m.tampil();
        s.tampil();
    }
}