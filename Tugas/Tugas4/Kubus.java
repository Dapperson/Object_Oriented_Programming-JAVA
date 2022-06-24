package Tugas4;

public class Kubus implements InterfaceKubusBalok {

    int a;

    public Kubus() {
        a = 14;
    }

    public Kubus(int a) {
        this.a = a;
    }

    public double getLuas() {
        return 6 * a;
    }

    public double getKeliling() {
        return 12 * a;
    }
}
