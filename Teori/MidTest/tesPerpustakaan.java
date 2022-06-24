/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MidTest;

/**
 *
 * @author Asus
 */
public class tesPerpustakaan {
    public static void main(String[] args) {
        BukuAnak ba1 = new BukuAnak("The Giving Tree", 1964, 30, 7);
        System.out.println(ba1);

        BukuAnak ba2 = new BukuAnak("Charlie & The Chocolate Factory", 1964, 101, 8);
        System.out.println(ba2);

        Komik k1 = new Komik("Dragon Ball", 1984, 60, "Goku");
        System.out.println(k1);

        Komik k2 = new Komik("Yu Gi Oh", 1996, 77, "Yugi Matou");
        System.out.println(k2);
    }

    // public static void main(String[] args) {

    // BukuAnak ba1 = new BukuAnak("The Giving Tree", 1964, 7);
    // System.out.println(ba1);

    // BukuAnak ba2 = new BukuAnak("Charlie & The Chocolate Factory", 1964, 8);
    // System.out.println(ba2);

    // Komik k1 = new Komik("Dragon Ball", 1984, "Goku");
    // System.out.println(k1);

    // Komik k2 = new Komik("Yu Gi Oh", 1996, "Yugi Matou");
    // System.out.println(k2);
    // }
}
