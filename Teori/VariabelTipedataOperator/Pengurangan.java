/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VariabelTipedataOperator;

/**
 *
 * @author Asus
 */
public class Pengurangan {
    public static void main(String [] args){
        int x, y, z;
    x = 42;
    y = x--;
       
    System.out.println("Nilai saat ini:");
        System.out.println( " x = " + x +
                            " y = " + y);
    z = --x;
    System.out.println("Nilai saat ini:");
    System.out.println( " x = " + x +
                        " z = " + z);
    }
}
