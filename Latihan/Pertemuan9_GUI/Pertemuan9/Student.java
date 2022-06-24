/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9_GUI.Pertemuan9;

/**
 *
 * @author Asus
 */
public class Student {

    private String name;
    private Double homework, midExam, finalExam;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHomework() {
        return homework;
    }

    public void setHomework(Double homework) {
        this.homework = homework;
    }

    public Double getMidExam() {
        return midExam;
    }

    public void setMidExam(Double midExam) {
        this.midExam = midExam;
    }

    public Double getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(Double finalExam) {
        this.finalExam = finalExam;
    }

    public Double calcAvgScore() {
        Double avgScore = (this.homework + this.midExam + this.finalExam) / 3;

        return avgScore;
    }

    public String calcFinalResult() {
        String pass = calcAvgScore() >= 56 ? "Pass" : "NOT Pass";

        return pass;
    }

    public char calcGrade() {
        var avgScore = calcAvgScore();

        if (avgScore >= 80) {
            return 'A';
        } else if (avgScore >= 65) {
            return 'B';
        } else if (avgScore >= 56) {
            return 'C';
        } else if (avgScore >= 40) {
            return 'D';
        } else {
            return 'E';
        }
    }
}
