/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MidTest;

/**
 *
 * @author Asus
 */
public class BukuAnak extends Buku{
    private int usia;

    public BukuAnak(String penerbit, int tahunTerbit, int tebalBuku, int usia) {
        super(penerbit, tahunTerbit);
        this.usia = usia;
        this.tebalBuku = tebalBuku;
    }

    public int getUsia() {
        return usia;
    }

    public void getUsia(int usia) {
        this.usia = usia;
    }

    public String toString() {
        TebalBuku();
        return "Buku Anak [judul = " + getPenerbit() + ", tahun terbit = " + getTahunTerbit() + ", batasan usia = "
                + usia + ", " + tebalBuku + " lembar = " + ket + " ]";
    }
}
