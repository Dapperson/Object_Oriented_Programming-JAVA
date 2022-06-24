/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Review1;

/**
 *
 * @author Asus
 */
public class TesLingkaran {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(1.1); // Cek Konstruktor dan toString
        System.out.println(l1); // toString()

        Lingkaran l2 = new Lingkaran(); // Konstruktur default
        System.out.println(l2);

        l1.setRad(2.2);
        System.out.println(l1);
        System.out.println("Jari - jari lingkaran 1: " + l1.getRadius());
        System.out.printf("Luas lingkaran 1: %.2f%n", l1.getLuas());
        System.out.printf("Keliling lingkaran 1: %.2f%n", l1.getKeliling());
    }
}
