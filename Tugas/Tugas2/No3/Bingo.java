package Tugas2.No3;

public class Bingo {
    String word1, word2, word3, word4, word5;

    public Bingo (String word1, String word2, String word3, String word4, String word5){
        this.word1=word1;
        this.word2=word2;
        this.word3=word3;
        this.word4=word4;
        this.word5=word5;
    }

    void print(String word1, String word2, String word3, String word4, String word5){
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        System.out.println(word1 + " - " + word2 + " - " + word3 + " - " + word4 + " - " + word5 );
        System.out.println(word1 + " - " + word2 + " - " + word3 + " - " + word4 + " - " + word5 );
        System.out.println(word1 + " - " + word2 + " - " + word3 + " - " + word4 + " - " + word5 );
        System.out.println("And Bingo was his name-o. \n");
    }
}
