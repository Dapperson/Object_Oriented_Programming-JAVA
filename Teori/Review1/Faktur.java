/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Review1;

/**
 *
 * @author Asus
 */
public class Faktur {
    String Id;
    String namaBarang;
    int jumlah;
    int hargaSatuan;

    public Faktur(String string, String string2, int i, int j) {
        this.Id = string = "A101";
        this.namaBarang = string2 = "Pensil Hijau";
        this.jumlah = i;
        this.hargaSatuan = j;
    }

    public void setJumlah(int i) {
        this.jumlah = i;
    }

    public void setHargaSatuan(int i) {
        this.hargaSatuan = i;
    }

    public String getID() {
        return Id;
    }

    public String getNama() {
        return namaBarang;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public int getTotal() {
        int total;
        return total = jumlah * hargaSatuan;
    }

    public String toString() {
        return "Faktur [Id = " + Id + ", namaBarang = " + namaBarang + " jumlah = " + jumlah + " hargaSatuan = "
                + hargaSatuan + "]";
    }
}
