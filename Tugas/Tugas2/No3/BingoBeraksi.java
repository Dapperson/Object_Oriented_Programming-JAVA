package Tugas2.No3;

public class BingoBeraksi {
    public static void main(String[] args) {
        Bingo bingo = new Bingo("B","I","N","G","O");
        
        String clap = "(clap)";

        bingo.print(bingo.word1, bingo.word2, bingo.word3, bingo.word4, bingo.word5);
        bingo.print(clap, bingo.word1, bingo.word3, bingo.word4, bingo.word5);
        bingo.print(clap, clap, bingo.word3, bingo.word4, bingo.word5);
        bingo.print(clap, clap, clap, bingo.word4, bingo.word5);
        bingo.print(clap, clap, clap, clap, bingo.word5);
        bingo.print(clap, clap, clap, clap, clap);
    }
}