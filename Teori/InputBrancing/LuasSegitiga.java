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
public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan bilangan pertama : ");
        double a = input.nextDouble();

        System.out.println("Masukkan bilangan kedua : ");
        double t = input.nextDouble();

        double luas = (a*t)/2;
        
        System.out.println("Hasil perkalian : " + luas);
    }
}
