package Tugas5;

import java.util.Scanner;

public class Kriteria {

    double IMT, tb, bb;
    String ket, kel, jk;

    Scanner input = new Scanner(System.in);

    Kriteria() {
        this.setKel();
        this.setBerat();
        this.setTinggi();
        this.setIMT();
        this.setKet();
    }

    public String getKel() {
        return kel;
    }

    public void setKel() {
        System.out.println("Pilih Jenis Kelamin (P/W)   : ");
        this.jk = input.nextLine();

        switch (jk) {
            case "P":
                kel = "Pria";
                break;
            case "W":
                kel = "Wanita";
                break;
        }
    }

    public double getIMT() {
        return IMT;
    }

    public void setIMT() {
        this.IMT = (bb / ((tb * 0.01) * (tb * 0.01)));
    }

    public void setTinggi() {
        System.out.println("Masukkan Tinggi Badan : ");
        this.tb = input.nextDouble();
    }

    public double getTinggi() {
        return tb;
    }

    public void setBerat() {
        System.out.println("Masukkan Berat Badan   : ");
        this.bb = input.nextDouble();
    }

    public double getBerat() {
        return bb;
    }

    public String getKet() {
        return ket;
    }

    public void setKet() {
        if (IMT <= 18.4) {
            ket = "Berat Badan Kurang";
        } else if (IMT >= 18.5 & IMT <= 24.9) {
            ket = "Berat Badan Ideal";
        } else if (IMT >= 25 & IMT <= 29.9) {
            ket = "Berat Badan Lebih";
        } else if (IMT >= 30 & IMT <= 34.9) {
            ket = "Gemuk";
        } else
            ket = "Sangat Gemuk";
    }
}
