/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassObjekMethodAtribut;

/**
 *
 * @author Asus
 */
public class BankBeraksi {
    public static void main(String[] args) {
        Bank Bankku = new Bank("Rp.100000");
        System.out.println("Selamat Datang Dibank ABC");
        System.out.println("Saldo saat ini:" + Bankku.saldo + '\n');
        Bankku.saldo = "Rp. 500000";
        System.out.println("Simpan Uang:" + Bankku.saldo);
        Bankku.saldo = "Rp.600000";
        System.out.println("Saldo saat ini:" + Bankku.saldo + '\n');
        Bankku.saldo = "Rp.150000";
        System.out.println("Ambil :" + Bankku.saldo);
        Bankku.saldo = "Rp.450000";
        System.out.println("Saldo saat ini:" + Bankku.saldo + '\n');
    }
}
