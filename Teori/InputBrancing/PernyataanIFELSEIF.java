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
public class PernyataanIFELSEIF {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai : ");

        int skorUjian = input.nextInt();
        char nilai;
        if (skorUjian >=90){
            nilai = 'A';
        }
        else if(skorUjian >= 80){
            nilai ='B';
        }
        else if(skorUjian>=70){
            nilai='C';
        }
        else{
            nilai='D';
        }
    }
}
