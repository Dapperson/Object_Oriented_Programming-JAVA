/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractionEncapsulationInheritancePolymorphism;

/**
 *
 * @author Asus
 */
public class SepedaBeraksi {
//    Ecapsulation
    public static void main(String[] args) {
        Sepeda sepedaku = new Sepeda();

        sepedaku.setGir(1);
        //sepedaku.gir=3;
        System.out.println("Gir saat ini: " + sepedaku.getGir());
    }
}
