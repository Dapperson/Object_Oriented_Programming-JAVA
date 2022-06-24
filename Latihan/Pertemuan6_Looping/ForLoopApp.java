package Pertemuan6_Looping;

public class ForLoopApp {

    public static void main(final String[] args) {
        int totalGanjil = 0;
        int totalGenap = 0;
        System.out.println("For Loop (0 - 20)");
        for (int i = 0; i <= 20; ++i) {
            System.out.print(i + ", ");
            if (i % 2 == 0) {
                totalGenap += i;
            } else {
                totalGanjil += i;
            }
        }
        System.out.println("\nDeret Ganjil: " + totalGanjil);
        System.out.println("Deret Genap: " + totalGenap);
        System.out.println("--------------------------------");
        totalGanjil = 0;
        totalGenap = 0;
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + ", ");
            totalGenap += i;
        }
        System.out.println("");
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + ", ");
            totalGanjil += i;
        }
        System.out.println("\nDeret Ganjil: " + totalGanjil);
        System.out.println("Deret Genap: " + totalGenap);
    }
}