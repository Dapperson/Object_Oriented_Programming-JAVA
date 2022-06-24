/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputBrancing;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Perkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan bilangan pertama : ");
        int bilangan1 = input.nextInt();

        System.out.println("Masukkan bilangan kedua : ");
        int bilangan2 = input.nextInt();

        System.out.println("Hasil perkalian : " + (bilangan1*bilangan2));
    }
}
