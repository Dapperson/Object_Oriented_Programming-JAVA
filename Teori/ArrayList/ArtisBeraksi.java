/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class ArtisBeraksi {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList();
        names.add("Wahyu Sardono\n");
        names.add("Kasino Hadiwibowo\n");
        names.add("Indrodjojo Kusumonegoro\n");
        names.add("Nanu Mulyono\n");
        names.add("Rudy Badil\n");

        System.out.println(names + "\n");

        names.add("Benjamin Sueb\n");

        System.out.println(names + "\n");

        names.add(1, "Mat Solar\n");
        names.add(2, "Dorman Borisman\n");

        System.out.println(names + "\n");

        names.set(3, "Benjamin Sueb\n");

        System.out.println(names + "\n");
    }
}
