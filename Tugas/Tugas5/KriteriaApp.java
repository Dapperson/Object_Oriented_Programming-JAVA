package Tugas5;

public class KriteriaApp {
    public static void main(String[] args) {

        Kriteria kategori = new Kriteria();

        System.out.println("Jenis Kelamin (P/W) : " + kategori.getKel());
        System.out.println("Berat Badan         : " + kategori.getBerat());
        System.out.println("Tinggi badan        : " + kategori.getTinggi());
        System.out.println("IMT                 : " + kategori.getIMT());
        System.out.println("Kriteria            : " + kategori.getKet());
    }
}
