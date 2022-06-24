package Pertemuan6_Looping;

public class ForLoopCharApp {
    public static void main(final String[] args) {
        for (char c = '0'; c <= 'z'; ++c) {
            System.out.println("Karakter: " + c);
        }
        for (char c = 'z'; c >= 'a'; --c) {
            System.out.println("Karakter: " + c);
        }
    }
}
