package Pertemuan7_Array;

import java.util.Scanner;

public class ArrayDemoApp {
    public static void main(String[] args) {
        // Declare
        String[] studentnames;

        // Allocate memory
        studentnames = new String[3];

        // Initialize
        // Remember to Start from 0
        studentnames[0] = "Ahmad";
        studentnames[1] = "Maul";
        studentnames[2] = "Ana Malik";

        System.out.println(studentnames[0]);
        System.out.println(studentnames[1]);
        System.out.println(studentnames[2]);

        System.out.println("--------------");

        Scanner input = new Scanner(System.in);

        String[] cities = new String[3];

        for (int i = 0; i < cities.length; i++) {
            System.out.print("City " + (i + 1) + " : ");
            cities[i] = input.nextLine();
        }

        // foreach
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
