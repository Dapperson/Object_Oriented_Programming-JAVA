package Pertemuan3_PackagesEncapsulationInheritance;

public class EmployeeApp {
    public static void main(String[] args) {
    Employee fadil = new Employee();

    fadil.name = "fadil";
    fadil.department = "Software Dev.";
    fadil.sayHallo();

    Manager gani = new Manager();

    gani.name = "gani";
    gani.department = "Software Dev.";
    gani.sayHallo();

    ResearcherOfAI roni = new ResearcherOfAI();
    roni.name = "roni";
    roni.department = "Data Scientist";
    roni.sayHallo();
    System.out.println(roni.getPosition());

    gani.setSalary(6_000_000);
    System.out.println(gani.getSalary());
    }
}
