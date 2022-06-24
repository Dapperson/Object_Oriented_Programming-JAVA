package Pertemuan3_PackagesEncapsulationInheritance;

public class Manager extends Employee{
    private int salary;
    private String position = "Manager";

    void setSalary(int i){
        this.salary = salary;
    }

    int getSalary(){
        return this.salary;
    }

    String getPosition(){
        return this.position;
    }

    // overiding
    void sayHallo(){
        System.out.println("Hi friends! I'm " + this.name + "I work on" + this.department);
    }
}
