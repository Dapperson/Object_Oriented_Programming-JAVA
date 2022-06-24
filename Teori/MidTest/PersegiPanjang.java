/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MidTest;

/**
 *
 * @author Asus
 */
public class PersegiPanjang {
    double p, l, luas, keliling;

    public PersegiPanjang(double d, double e) {
        this.p = d;
        this.l = e;
    }

    public PersegiPanjang() {
        this.p = 1.0;
        this.l = 1.0;
    }

    public void setPanjang(double d) {
        this.p = d;
    }

    public void setLebar(double e) {
        this.l = e;
    }

    public double getPanjang() {
        return p;
    }

    public double getLebar() {
        return l;
    }

    public double getLuas() {
        return luas = p * l;
    }

    public double getKeliling() {
        return keliling = 2 * (p + l);
    }

    public String toString() {
        return "PersegiPanjang [panjang = " + p + " ,lebar = " + l + "]";
    }
}
