/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MidTest;

/**
 *
 * @author Asus
 */
public class Buku {
    private String penerbit;
    public String ket;
    private int tahunTerbit;
    public int tebalBuku;

    public Buku(String penerbit, int tahunTerbit) {
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getTebal() {
        return ket;
    }

    public void setTebal(String tebal) {
        this.ket = tebal;
    }

    public void TebalBuku() {

        if (this.tebalBuku <= 50) {
            ket = "Tipis";
        } else if (this.tebalBuku >= 51 & this.tebalBuku <= 100) {
            ket = "Sedang";
        } else {
            ket = "Tebal";
        }
    }
}
