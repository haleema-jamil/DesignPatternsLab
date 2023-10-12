package SoftPrinciples.Aggregation.Department;

import java.util.ArrayList;
import java.util.List;

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }
}

public class Aggregation {
    public static void main(String[] args) {

        Department HR = new Department("Human Resources");
        Department IT = new Department("Information Technology");

        Employee employee1 = new Employee("Haleema", HR);
        Employee employee2 = new Employee("Marwa", IT);
        Employee employee3 = new Employee("Tooba", HR);

        List<Employee> HREmployees = new ArrayList<>();
        HREmployees.add(employee1);
        HREmployees.add(employee3);

        System.out.println(employee1.getName() + " works in " + employee1.getDepartment().getName());
        System.out.println(employee2.getName() + " works in " + employee2.getDepartment().getName());
        System.out.println(employee3.getName() + " works in " + employee3.getDepartment().getName());

        System.out.println("Employees in HR department:");
        for (Employee employee : HREmployees) {
            System.out.println("- " + employee.getName());
        }
    }
}