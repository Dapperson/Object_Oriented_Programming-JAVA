/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author Asus
 */
public class NegaraKota {
    public static void main(String[] args) {
        String[][] nama = {
                { "Amerika", "Inggris", "Jepang", "Perancis", "Indonesia", "Iran", "Irak" },
                { "Teheran", "Bekasi", "Jakarta", "Bantar Gebang", "Tokyo" }
        };
        System.out.println("Ibukota " + nama[0][4] + " adalah " + nama[1][2]);
        System.out.println("Ibukota " + nama[0][2] + " adalah " + nama[1][4]);
        System.out.println("Ibukota " + nama[0][5] + " adalah " + nama[1][0]);
    }
}
