/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan1_ClassObjectVariableMethod;

/**
 *
 * @author Asus
 */
public class SepedaAksi {
    public static void main(String[] args) {
        // Membuat object
         Sepeda sepedaku = new Sepeda(); 
         /* memanggil atribut dan memberi nilai */ 
         sepedaku.warna = "Hitam"; 
         sepedaku.tahunProduksi = 2006; 
         System.out.println("Kring-kring Sepedaku..."); 
         System.out.println("Sepedaku berwarna : " + sepedaku.warna); 
         System.out.println("Diproduksi tahun : " + sepedaku.tahunProduksi); 
        }
}
