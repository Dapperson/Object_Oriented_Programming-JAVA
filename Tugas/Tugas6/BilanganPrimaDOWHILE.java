package Tugas6;

public class BilanganPrimaDOWHILE {
    public static void main(String[] args) {
        int num;
        int i = 0;
        int totalprima = 0;
        int totalnonprima = 0;
        String bil_prima = "";
        String bil_non_prima = "";

        do {
            int prima = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    prima = prima + 1;
                }
            }
            if (prima == 2) {
                bil_prima = bil_prima + i + " ";
                totalprima += i;
            } else {
                bil_non_prima = bil_non_prima + i + " ";
                totalnonprima += i;
            }
        } while (++i <= 20);
        System.out.println("\nMENGGUNAKAN 'DO WHILE'");
        System.out.println("\nBilangan prima");
        System.out.println(bil_prima);
        System.out.println("\nBilangan non prima");
        System.out.println(bil_non_prima);
        System.out.println("\nTotal bilangan prima : " + totalprima);
        System.out.println("Total bilangan non prima : " + totalnonprima);
    }
}
