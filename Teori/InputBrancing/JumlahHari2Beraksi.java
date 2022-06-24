/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputBrancing;

/**
 *
 * @author Asus
 */
public class JumlahHari2Beraksi {
    public static void main(String[] args) {
        JumlahHari2 hari = new JumlahHari2(1900, 2);

        System.out.println("Masukkan tahun: " + hari.tahun);
        System.out.println("Masukkan bulan: " + hari.bulan);
        hari.hitungHari();
    }
}
