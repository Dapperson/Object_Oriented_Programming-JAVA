package Pertemuan7_Array;


import java.util.Scanner;

public class StudentsApp {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        var students = new Students(3);

        String[] names = new String[students.getnStudent()];
        double[] examResults = new double[students.getnStudent()];

        for (int i = 0; i < students.getnStudent(); i++) {
            System.out.println("Student " + (i + 1) + "");
            System.out.print("Name : ");
            names[i] = scanner.next();

            System.out.print("Exam : ");
            examResults[i] = scanner.nextDouble();
        }

        students.setName(names);
        students.setExamResults(examResults);

        for (int i = 0; i < students.getnStudent(); i++) {
            System.out.print(students.getName()[i]);
            System.out.print(" : ");
            System.out.println(students.getExamResults()[i]);
        }

    }
}
