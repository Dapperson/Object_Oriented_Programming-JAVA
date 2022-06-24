/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputBrancing;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class BankBeraksi {
    public static void main(String[] args) {
        Bank print = new Bank(100000);

        Scanner input = new Scanner(System.in);

        System.out.println("Menu ATM: \n 1. Cek Saldo \n 2. Ambil Uang \n 3. Simpan Uang \n Pilih Menu : ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            print.cekSaldo();
        } else if (pilihan == 2) {
            print.simpanUang(150000);
        } else if (pilihan == 3) {
            print.ambilUang(250000);
        } else
            System.out.println("Pilhan Salah!");
    }
}
