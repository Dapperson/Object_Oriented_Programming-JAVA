package Pertemuan7_Array;

public class Students {
    private int nStudent;
    
    private String[] name = new String[10];
    private double[] examResults = new double[nStudent];
    
    public Students(int nStudent){
        this.setnStudent(nStudent);
    }
    
    public int getnStudent() {
        return nStudent;
    }

    public void setnStudent(int nStudent) {
        if (nStudent > 0){
            this.nStudent = nStudent;
        } else {
            nStudent = 0;
        }
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public double[] getExamResults() {
        return examResults;
    }

    public void setExamResults(double[] examResults) {
        this.examResults = examResults;
    }
    
    
}
