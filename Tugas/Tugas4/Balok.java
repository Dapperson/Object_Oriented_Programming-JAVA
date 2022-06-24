package Tugas4;

public class Balok implements InterfaceKubusBalok {
    int b, c, d;

    public Balok(int b, int c) {
        this.b = b;
        this.c = c;
        d = 14;
    }

    public Balok(int b, int c, int d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int getPanjang() {
        return b;
    }

    public int getLebar() {
        return c;
    }

    public int getTinggi() {
        return d;
    }

    public double getLuas() {
        return b * c * d;
    }

    public double getKeliling() {
        return 4 * (b + c + d);
    }
}