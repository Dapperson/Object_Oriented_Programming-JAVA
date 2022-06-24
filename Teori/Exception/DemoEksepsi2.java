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
public class DemoEksepsi2 {
    public static void main(String args[]) throws IOException{
        File myFile = new File("test.txt");
        myFile.createNewFile();
    }
}
