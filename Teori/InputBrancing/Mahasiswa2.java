/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputBrancing;

/**
 *
 * @author Asus
 */
public class Mahasiswa2 extends Mahasiswa1{
    void Grade(){
        if (NA>=80) {
            System.out.println("Nilai A");
        }
        else if (NA>=65) {
            System.out.println("Nilai B");
        }
        else if (NA>=56) {
            System.out.println("Nilai C");
        }
        else if (NA>=40) {
            System.out.println("Nilai D");
        }
        else{
            System.out.println("Nilai E");
        }
    }
}
