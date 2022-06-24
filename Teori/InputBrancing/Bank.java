/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputBrancing;

/**
 *
 * @author Asus
 */
public class Bank {
    int saldo, simpanUang, ambilUang;

  public Bank(int saldo) {
    this.saldo = saldo;
  }

  public void cekSaldo() {
    this.saldo = 100000;
    System.out.println("Selamat Datang di Bank ABC");
    System.out.println("Saldo saat ini: Rp." + saldo + "\n");
  }

  public void simpanUang(int simpanUang) {
    this.saldo = 250000;
    System.out.println("Simpan uang: Rp." + simpanUang);
    System.out.println("Saldo saat ini: Rp." + saldo + "\n");
  }

  public void ambilUang(int ambilUang) {
    this.saldo = 250000;
    if (saldo <= ambilUang) {
      System.out.println("Maaf saldo anda kurang!");
    } else {
      System.out.println("Ambil uang: Rp." + ambilUang);
      System.out.println("Saldo saat ini: Rp." + saldo);
    }
  }
}
