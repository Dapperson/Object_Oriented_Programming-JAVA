/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author Asus
 */
public class DemoThrow {
    public static void main(String args[]){
        RuntimeException r = new
        RuntimeException("Eksepsi RuntimeException");

        System.out.println("Sebelum Throw");
        throw(r);
    }
}
