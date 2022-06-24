/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Asus
 */
public class ACBeraksi {
    public static void main(String[] args) {
        Beraksi ac = new Beraksi();

        System.out.println("AC : Mati");

        ac.Hidupkan();
        ac.Dinginkan();
        ac.Dinginkan();
        ac.Panaskan();
        ac.Panaskan();
        ac.Matikan();
        ac.Matikan();
        ac.Hidupkan();
    }
}
