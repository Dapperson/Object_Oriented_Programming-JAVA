/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Review1;

/**
 *
 * @author Asus
 */
public class Lingkaran {
    private double r;

    public Lingkaran() {
        this.r = 1.0;
    }

    public Lingkaran(double jari) {
        this.r = jari;
    }

    public void setRad(double jari) {
        this.r = jari;
    }

    public double getRadius() {
        return r;
    }

    public double getLuas() {
        double luas = (22 * r * r) / 7;
        return luas;
    }

    public double getKeliling() {
        double kel = (2 * 22 * r) / 7;
        return kel;
    }

    public String toString() {
        return "Lingkaran [Jari-jari = " + r + "]";
    }
}
