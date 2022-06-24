package Tugas2.No2;

public class Matematika implements MatematikaInterface {
    @Override
    public void pertambahan() {
        int hasilTambah = tambahA + tambahB;
        System.out.println("Pertambahan     : " + tambahA + " + " + tambahB + " = " + hasilTambah);
    }

    @Override
    public void pengurangan() {
        int hasilKurang = kurangA - kurangB;
        System.out.println("Pengurangan     : " + kurangA + " - " + kurangB + " = " + hasilKurang);
    }

    @Override
    public void perkalian() {
        int hasilKali = kaliA * kaliB;
        System.out.println("Perkaliam       : " + kaliA + " x " + kaliB + " = " + hasilKali);
    }

    @Override
    public void pembagian() {
        int hasilBagi = bagiA / bagiB;
        System.out.println("Pembagian       : " + bagiA + " : " + bagiB + " = " + hasilBagi);
    }
}