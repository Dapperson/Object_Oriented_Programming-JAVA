package Pertemuan5_InputBrancing;

import java.util.Scanner;

public class ReportApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examScore;
        char grade;
        int distance = 10;
        boolean isPassed;

        System.out.println("Exam Score: ");
        examScore = scanner.nextInt();

        if (examScore >= 90 & distance <= 10) {
            grade = 'A';
        } else if (examScore >= 80) {
            grade = 'B';
        } else if (examScore >= 70) {
            grade = 'C';
        } else if (examScore >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        System.out.println("Grade \t : " + grade);

        isPassed = examScore >= 70 ? true : false;

        System.out.println("Grade \t : " + grade);
        System.out.println("Is Passed \t : " + isPassed);
    }
}