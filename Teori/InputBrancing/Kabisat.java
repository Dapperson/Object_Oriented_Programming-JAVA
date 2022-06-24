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
public class Kabisat {
    public static void main(String[] args) {
        int tahun;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan tahun : ");
        tahun = scan.nextInt();
        if (tahun % 400 == 0) {
            System.out.print(tahun + " Merupakan Tahun Kabisat\n");
        } else if (tahun % 100 == 0) {
            System.out.print(tahun + " Bukan Tahun Kabisat\n");
        } else if (tahun % 4 == 0) {
            System.out.print(tahun + " Merupakan Tahun Kabisat\n");
        } else {
            System.out.print(tahun + " Bukan Tahun Kabisat\n");
        }
    }
}
