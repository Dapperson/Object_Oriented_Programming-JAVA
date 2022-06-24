package Tugas6;

import java.util.Scanner;

public class PerkalianTabel {
    public static void main(String[] args) {

        int bil = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        bil = input.nextInt();
        System.out.println("");

        for (int d = 0; d <= bil; d++) {
            System.out.print("|" + d + "|" + "\t");
        }
        System.out.println("\n");

        for (int p = 1; p <= bil; p++) {
            System.out.print("|" + p + "|" + "\t");

            for (int j = 1; j <= bil; j++) {
                System.out.print("|" + j * p + "|" + "\t");
            }
            System.out.print("\n\n");
        }
    }
}
