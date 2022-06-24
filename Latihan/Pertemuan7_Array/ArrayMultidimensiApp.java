package Pertemuan7_Array;

public class ArrayMultidimensiApp {
    public static void main(String[] args) {
        String[][] names = {
            {"Sir", "Maam", "Sis"},
            {"Joko", "Susi"}
        };
        
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.println(names[i][j]);
            }
        }
        
        for (String[] name : names) {
            for (String name1 : name) {
                System.out.println(name1);
            }
        }
    }
}
