package Tugas6;

import java.util.Scanner;

public class LaguAnakApp {
    public static void main(String[] args) {

        int anak_ayam;
        Scanner input = new Scanner(System.in);

        System.out.println("Menggunakan FOR");
        System.out.print("Inputkan banyaknya jumlah anak ayam: ");
        anak_ayam = input.nextInt();

        System.out.println("\nTek Kotek Kotek Kotek \nAnak Ayam Turun Berkotek");

        for (int i = anak_ayam; i > 1; i--) {
            System.out.println("\nAnak Ayam Turunlah " + anak_ayam);
            anak_ayam = i - 1;
            System.out.println("Mati Satu Tinggallah " + anak_ayam);
        }
        System.out.println("\nAnak Ayam Turunlah Satu\nMati Satu Tinggallah Induknya");

        int anak_ayam2;
        System.out.println("\nMenggunakan WHILE");
        System.out.print("Inputkan banyaknya jumlah anak ayam: ");
        anak_ayam2 = input.nextInt();

        System.out.println("\nTek Kotek Kotek Kotek \nAnak Ayam Turun Berkotek");

        int j = anak_ayam2;
        while (j > 1) {
            System.out.println("\nAnak Ayam Turunlah " + anak_ayam2);
            anak_ayam2 = j - 1;
            System.out.println("Mati Satu Tinggallah " + anak_ayam2);
            j--;
        }
        System.out.println("\nAnak Ayam Turunlah Satu\nMati Satu Tinggallah Induknya");

        int anak_ayam3;
        System.out.println("\nMenggunakan DO WHILE");
        System.out.print("Inputkan banyaknya jumlah anak ayam: ");
        anak_ayam3 = input.nextInt();

        int k = anak_ayam3;
        do {
            System.out.println("\nAnak Ayam Turunlah " + anak_ayam3);
            anak_ayam3 = k - 1;
            System.out.println("Mati Satu Tinggallah " + anak_ayam3);
            k--;
            System.out.println("\nAnak Ayam Turunlah Satu\nMati Satu Tinggallah Induknya");
        } while (k > 1);
    }
}