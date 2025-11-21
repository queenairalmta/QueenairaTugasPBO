
package Tugas6;

public class Soal2 {
   public static void main(String[] args) {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {
                mobil[i] = "HR-V"; 
                System.out.println("Nilai baru pada indeks " + i + " = " + mobil[i]);
            }
        }
    } 
}
