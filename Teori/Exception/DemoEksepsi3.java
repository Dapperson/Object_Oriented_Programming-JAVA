/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Asus
 */
public class DemoEksepsi3 {
    public static void main(String args[]){
        try{
            File mySile = new File("test.txt");
            myFile.CreateNewFile();
            System.out.println("File berhasil dibuat");
        }catch(IOException e){
            System.out.println("File gagal dibuat");
        }
    }
}
