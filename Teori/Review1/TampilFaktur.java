/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Review1;

import Review1.Faktur;

/**
 *
 * @author Asus
 */
public class TampilFaktur {
    public static void main(String[] args) {

        Faktur fkt1 = new Faktur("A101", "Pensil hijau ", 77, 750);
        System.out.println(fkt1); // toString

        fkt1.setJumlah(99);
        fkt1.setHargaSatuan(900);

        System.out.println(fkt1); // toString
        System.out.println("ID: " + fkt1.getID());
        System.out.println("Nama Barang : " + fkt1.getNama());
        System.out.println("Jumlah Barang : " + fkt1.getJumlah());
        System.out.println("Harga Satuan : " + fkt1.getHargaSatuan());
        // Tampil getTotal
        System.out.println("Totalnya adalah : " + fkt1.getTotal());
    }
}
