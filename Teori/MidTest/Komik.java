/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MidTest;

/**
 *
 * @author Asus
 */
public class Komik extends Buku{
    private String karakter;

    public Komik(String penerbit, int tahunTerbit, int tebalBuku, String karakter) {
        super(penerbit, tahunTerbit);
        this.karakter = karakter;
        this.tebalBuku = tebalBuku;
    }

    public String getKarakter() {
        return karakter;
    }

    public void getUsia(String string) {
        this.karakter = string;
    }

    public String toString() {
        TebalBuku();
        return "Komik [judul = " + getPenerbit() + ", tahun terbit = " + getTahunTerbit() + ", karakter utama = "
                + karakter + ", " + tebalBuku + " lembar = " + ket + " ]";
    }
}
