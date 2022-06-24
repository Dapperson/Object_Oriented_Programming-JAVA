/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputBrancing;

/**
 *
 * @author Asus
 */
public class PernyataanSWITCH2 {
    public static void main(String[] args) {
        int pilihan = 3;
        switch(pilihan){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            System.out.println("Hari Kerja");
            break;

            case 6:
            case 7:
            System.out.println("Hari Libur");
            break;

            default:
            System.out.println("Silahkan pilih hari");
        }
    }
}
