/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author Asus
 */
public class DemoEksepsi4 {
    public static void main(String args[]){
        try{
            int x =args.length; int y = 100/x;
            int[] arr = {0,1,2,3};
            y = arr[x];
            System.out.println("Jumlah Argument" + y);
            System.out.println("Tidak terjadi eksepsi");
        }catch(ArithmeticException e){
            System.out.println("Terjadi eksepsi karena pembagian dengan nol" + e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Terjadi eksepsi karena indeks diluar kapasistas");
        }catch(Throwable e){
            System.out.println("Terjadi eksepsi yg tidak diketahui");
        }
        System.out.println("Setelah blok try catch");
    }
}
