/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author Asus
 */
public class CekBilangan {
    public static void main(String[] args) {
        int[] bilangan = { 9, 3, 7, 8, 2, 4 };

        System.out.println(bilangan[0]);
        System.out.println(bilangan[1]);
        System.out.println(bilangan[2]);
        System.out.println(bilangan[3]);
        System.out.println(bilangan[4]);
        System.out.println(bilangan[5]);

        System.out.println("\n");

        for (int i = 2; bilangan[0] > bilangan[1]; i++) {
            System.out.print(bilangan[i] + " ");
        }
    }
}
