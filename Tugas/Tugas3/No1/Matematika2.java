package Tugas3.No1;

public class Matematika2 extends Matematika{
    double modulus;

    void modulus(int a, int b) {
        modulus = a % b;
        System.out.println("Modulus         :" + a + " : " + b + " = " + modulus);
    }
}