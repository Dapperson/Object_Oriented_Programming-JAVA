/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputBrancing;

/**
 *
 * @author Asus
 */
public class Mahasiswa1 {
    int nilaiAbsen, nilaiTugas, nilaiUTS, nilaiUAS, NA;

    void nilaiAkhir(){
        NA = (nilaiAbsen*1/10)+(nilaiTugas*2/10)+(nilaiTugas*3/10)+(nilaiUAS*4/10);

        System.out.println("\n Nilai Akhir : " + NA);
    }
}
