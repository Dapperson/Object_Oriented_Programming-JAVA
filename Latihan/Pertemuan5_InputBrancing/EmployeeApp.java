package Pertemuan5_InputBrancing;

public class EmployeeApp {
    Employee employee = new Employee();
    
    System.out.println("Name \t\t : " + employee.getName());
    System.out.println("Department \t\t : " + employee.getDepartment());
    System.out.println("Age \t\t : " + employee.getAge());

    employee.sayHello();
}
