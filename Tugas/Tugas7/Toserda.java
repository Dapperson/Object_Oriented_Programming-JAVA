package Tugas7;

import java.util.Scanner;

public class Toserda {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int jum = 0, i = 0;
        int total_bayar = 0;
        String[] kode = new String[5];
        int[] banyak = new int[5];
        int[] harga = new int[5];
        int[] sub_total = new int[5];
        String[] barang = new String[5];

        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");
        System.out.print("Masukan Item Barang : ");
        jum = input.nextInt();
        System.out.println(" ");

        for (i = 0; i < jum; i++) {
            System.out.println("");
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukan Kode Barang : ");
            kode[i] = input.next();
            System.out.print("Masukan Jumlah Beli : ");
            banyak[i] = input.nextInt();

            switch (kode[i]) {
                case "a001":
                    barang[i] = "Buku";
                    harga[i] = 3000;
                    break;
                case "a002":
                    barang[i] = "Pensil";
                    harga[i] = 4000;
                    break;
                case "a003":
                    barang[i] = "Pulpen";
                    harga[i] = 5000;
                    break;
                case "a004":
                    barang[i] = "Penghapus";
                    harga[i] = 2500;
                    break;
                case "a005":
                    barang[i] = "Spidol";
                    harga[i] = 7000;
                    break;
                default:
                    System.out.println("Kode Barang Tidak Tersedia");
            }
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");
        System.out.println(" ");
        System.out.println("No\tKode Barang\t\tNama Barang\t\tHarga\t\tJumlah Beli\t\tSub Total");
        System.out.println(
                "==========================================================================================================");
        for (i = 0; i < jum; i++) {
            sub_total[i] = (banyak[i] * harga[i]);
            total_bayar += sub_total[i];
            System.out.println(
                    i + 1 + "\t" + kode[i] + "\t\t\t" + barang[i] + "\t\t\t" + (harga[i]) + "\t\t" + banyak[i]
                            + "\t\t\t"
                            + sub_total[i]);
        }
        System.out.println(
                "==========================================================================================================");
        System.out.println("Total Bayar : \t\t\t\t\t\t\t\t\t\t\t" + (total_bayar));
        System.out.println(
                "==========================================================================================================");
    }
}