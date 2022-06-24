/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputBrancing;

/**
 *
 * @author Asus
 */
public class OperatorTernary {
    public static void main(String[] args) {
        int totalBelanja = 500000;

        int diskon = totalBelanja >= 100000?totalBelanja/10:0;
        
        System.out.println("Diskon = " + diskon);
    }
}
