/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MidTest;

/**
 *
 * @author Asus
 */
public class hitungPersegiPanjang {
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang(3.4, 1.2);
        System.out.println(pp1);

        PersegiPanjang pp2 = new PersegiPanjang();
        System.out.println(pp2);

        pp1.setPanjang(7.8);
        pp1.setLebar(5.6);

        System.out.println(pp1); // toString()
        System.out.println("Panjang: " + pp1.getPanjang());
        System.out.println("Lebar: " + pp1.getLebar());
        System.out.printf("Luasnya adalah: %.2f%n", pp1.getLuas());
        System.out.printf("Kelilingnya adalah: %.2f%n", pp1.getKeliling());
    }
}
