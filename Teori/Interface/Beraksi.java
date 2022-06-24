/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Asus
 */
public class Beraksi implements InterfaceBeraksi{
    int ac;

    @Override
    public void Hidupkan() {
        if (this.ac == mati) {
            this.ac = hidup;
            System.out.println("Hidupkan AC! –> AC Hidup");
        } else {
            System.out.println("Hidupkan AC! –> AC Sudah Hidup");
        }
    }

    @Override
    public void Matikan() {
        if (this.ac == hidup) {
            this.ac = mati;
            System.out.println("Matikan AC! –> AC Mati");
        } else {
            System.out.println("Matikan AC! –> AC Suadah Mati");
        }
    }

    @Override
    public void Panaskan() {
        if (this.ac == dingin) {
            this.ac = panas;
            System.out.println("Panaskan AC! –> Pemanas Nyala");
        } else {
            System.out.println("Panaskan AC! –> Pemanas Sudah Nyala");
        }
    }

    @Override
    public void Dinginkan() {
        if (this.ac == panas) {
            this.ac = dingin;
            System.out.println("Dinginkan AC! –> Pendingin Nyala");
        } else {
            System.out.println("Dinginkan AC! –> Pendingin Sudah Nyala");
        }
    }
}
