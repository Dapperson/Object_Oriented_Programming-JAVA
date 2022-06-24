package Pertemuan6_Looping;

public class DoWhileApp {
    public static void main(final String[] args) {
        int totalGanjil = 0;
        int totalGenap = 0;
        int i = 0;
        System.out.println("Do While Loop (0 - 20)");
        do {
            System.out.print(i + ", ");
            if (i % 2 == 0) {
                totalGenap += i;
            }
            else {
                totalGanjil += i;
            }
        } while (++i <= 20);
        System.out.println("\nDeret Ganjil: " + totalGanjil);
        System.out.println("Deret Genap: " + totalGenap);
    }
}
