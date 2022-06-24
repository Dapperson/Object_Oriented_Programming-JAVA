/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassObjekMethodAtribut;

/**
 *
 * @author Asus
 */
public class Bank {
      String saldo;

  public Bank(String saldo) {
    this.saldo = saldo;
  }

  public void data() {
    System.out.println("Saldo saat ini:" + saldo);
    System.out.println("Simpan Uang:" + saldo);
    System.out.println("Ambil Uang:" + saldo);
  }

  void getsaldo() {
    System.out.println("Saldo saat ini:" + saldo);
  }
}
