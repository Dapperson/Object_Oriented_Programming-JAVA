package Pertemuan5_InputBrancing;

import java.util.Scanner;

public class InputApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstPrime;
        double litPi;
        String name;

        System.out.print("Input first prime number\t: ");
        firstPrime = scan.nextInt();

        System.out.print("Input lit Pi\t\t: ");
        litPi = scan.nextDouble();

        System.out.print("Input your name\t\t: ");
        name = scan.next();

        System.out.println("first prime\t :" + firstPrime);
        System.out.println("lit Pi \t\t : " + litPi);
        System.out.println("Name \t\t : " + name);

        System.out.println("-------------------------");

        System.out.println("Bakal bug klo name");
        System.out.println("yang atas mengandung spasi");

        System.out.println("[2] Input your name \t\t : ");
        name = scan.next();
        System.out.println("Name \t\t : " + name);

        System.out.println("[3] Input your name \t\t : ");
        name = scan.next();
        System.out.println("Name \t\t : " + name);
    }
}