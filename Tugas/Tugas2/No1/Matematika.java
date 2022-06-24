package Tugas2.No1;

public class Matematika {
    int pertambahan;
    int pengurangan;
    int perkalian;
    float pembagian;

    void pertambahan(int a, int b) {
        pertambahan = a + b;
        System.out.println("Pertambahan     :" + a + " + " + b + " = " + pertambahan);
    }

    void pengurangan(int a, int b) {
        pengurangan = a - b;
        System.out.println("Pengurangan     :" + a + " - " + b + " = " + pengurangan);
    }

    void perkalian(int a, int b) {
        perkalian = a * b;
        System.out.println("Perkalian       :" + a + " x " + b + " = " + perkalian);
    }

    void pembagian(int a, int b) {
        pembagian = a / b;
        System.out.println("Pembagian       :" + a + " : " + b + " = " + pembagian);
    }
}