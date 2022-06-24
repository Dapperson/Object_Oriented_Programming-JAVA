package Pertemuan6_Looping;

public class WhileLoopApp {
    public static void main(final String[] args) {
        int totalGanjil = 0;
        int totalGenap = 0;
        int i = 0;
        System.out.println("While Loop (0 - 20)");
        while (i <= 20) {
            System.out.print(i + ", ");
            if (i % 2 == 0) {
                totalGenap += i;
            } else {
                totalGanjil += i;
            }
            ++i;
        }
        System.out.println("\nDeret Ganjil: " + totalGanjil);
        System.out.println("Deret Genap: " + totalGenap);
    }
}
