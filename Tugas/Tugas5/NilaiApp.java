package Tugas5;

public class NilaiApp {
    public static void main(String[] args) {
        Nilai nilai = new Nilai();

        System.out.println("");
        System.out.println("NPM Mahasiswa\t: " + nilai.getNPM());
        System.out.println("Nama Mahasiswa\t: " + nilai.getNama());
        System.out.println("Nilai Rata-Rata\t: " + nilai.getNrata());
        System.out.println("Grade\t\t: " + nilai.getGrade());
        System.out.println("Keterangan\t: " + nilai.getKet());
    }
}
