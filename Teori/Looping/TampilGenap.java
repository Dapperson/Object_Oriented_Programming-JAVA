/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Looping;

/**
 *
 * @author Asus
 */
public class TampilGenap {
    public static void main(String[] args) {
        System.out.println("MENCETAK BILANGAN GENAP 1-20 (FOR)");
        for (int d = 1; d <= 20; d++) {
            if (d % 2 == 0)
                System.out.print(d + " ");
        }
        System.out.println("\n\n");
        System.out.println("MENCETAK BILANGAN GENAP 1-20 (WHILE)");
        int j = 1;
        while (j <= 20) {
            if (j % 2 == 0)
                System.out.print(j + " ");
            j++;
        }
    }
}
