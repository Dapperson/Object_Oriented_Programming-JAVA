/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractionEncapsulationInheritancePolymorphism;

/**
 *
 * @author Asus
 */

//Inheritance
public class SepedaGunungBeraksi {
    public static void main(String[] args) {
        SepedaGunung sg = new SepedaGunung();

        sg.setGir(3);
        System.out.println(sg.getGir());

        sg.setSadel(1);
        System.out.println(sg.getSadel());
    }
}
