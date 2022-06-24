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
public class Mahasiswa3 {
    public static void main(String[] args) {

        Mahasiswa2 mhs = new Mahasiswa2();

        Scanner input = new Scanner(System.in);

        System.out.println("NIM : ");
        String NIM = input.next();

        System.out.println("Nama : ");
        String Nama = input.next();

        System.out.println("Nilai Absen [10%] : ");
        mhs.nilaiAbsen = input.nextInt();
        System.out.println("Nilai Tugas [20%] : ");
        mhs.nilaiTugas = input.nextInt();
        System.out.println("Nilai UTS [30%] : ");
        mhs.nilaiUTS = input.nextInt();
        System.out.println("Nilai UAS [40%] : ");
        mhs.nilaiUAS = input.nextInt();

        mhs.nilaiAkhir();
        mhs.Grade();
    }
}
