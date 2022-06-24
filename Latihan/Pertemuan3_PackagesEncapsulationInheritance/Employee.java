package Pertemuan3_PackagesEncapsulationInheritance;

public class Employee{
    String name;
    String department;

    void sayHallo(){
        System.out.println("Hello! I'm " + this.name + ". I work on " + this.department);
    }
}
