
package Tugas10;

class Kendaraan{
    public String model;

    public Kendaraan(String model) {
        this.model = model;
    }
    
    public void informasi(){
        System.out.println("Model kendaraan: "+model);
    }
}

class Mobil extends Kendaraan{
    public String nama, jenis;

    public Mobil(String model, String nama, String jenis) {
        super(model);
        this.nama = nama;
        this.jenis = jenis;
    }
    
    @Override
    public void informasi(){
        super.informasi();
        System.out.println("Nama : "+nama);
        System.out.println("Jenis : "+jenis);
    }
}

class Pesawat extends Kendaraan{
    public String nama, jenis;

    public Pesawat(String model, String nama, String jenis) {
        super(model);
        this.nama = nama;
        this.jenis = jenis;
    }
       
    @Override
    public void informasi(){
        super.informasi();
        System.out.println("Nama : "+nama);
        System.out.println("Jenis : "+jenis);       
    }
}

class KapalLaut extends Kendaraan{
    public String nama, jenis;

    public KapalLaut(String model, String nama, String jenis) {
        super(model);
        this.nama = nama;
        this.jenis = jenis;
    }
      
    @Override
    public void informasi(){
        super.informasi();
        System.out.println("Nama : "+nama);
        System.out.println("Jenis : "+jenis);   
    }
}

public class Soal7 {
    public static void main(String[] args) {
        Mobil m = new Mobil("HR-V E Hev", "HR-V", "SUV hybrid");
        m.informasi();
        System.out.println();

        Pesawat p = new Pesawat("Boeing Series", "Boeing 737", "Pesawat komersial");
        p.informasi();
        System.out.println();
        
        KapalLaut k = new KapalLaut("Kruiselayar", "KM Binaiya", "Kapal penumpang");
        k.informasi();
        System.out.println();
    }
}
