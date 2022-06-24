package Pertemuan4_Polymorphism_NotificationsOverloadingOverriding;

public class EmployeeApp {
    public static void main(String[] args) {
        String name = "Fadil";
        String department = "Research";

        Employee fadil = new Employee(name, department);

        // fadil.name="fadil";
        // fadil.department = "Software Dev.";
        System.out.println(fadil.sayHello());
        System.out.println(fadil.sayHello(21));
        System.out.println(fadil.sayHello(21, 168.2));
        System.out.println(fadil.getSalary());

        int salary = 10_000_000;
        name = "Nurul";
        department = "DevOps";

        Employee nurul = new Employee(name, department, salary);

        System.out.println(nurul.getName());
        System.out.println(nurul.getDepartment());
        System.out.println(nurul.getSalary());
    }
}
