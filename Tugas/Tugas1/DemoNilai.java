package Tugas1;

public class DemoNilai {
    public static void main(String[] args) {

        // Mencetak NIM & nama serta memanggil variabel yang sudah dibuat
        Nilai nilai1 = new Nilai();
        System.out.println("NIM             :" + nilai1.nama);
        System.out.println("Nama            :" + nilai1.nama);

        // Memanggil method yang sudah dibuat
        Nilai nilai2 = new Nilai();
        nilai2.getNilai();
        nilai2.getCetakNilai();
    }
}
