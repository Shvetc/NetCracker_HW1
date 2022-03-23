package com.netcracker.projects.tasks.taskoop;

import com.netcracker.projects.tasks.taskoop.employee.Employee;

//Example work with methods class Employee
public class MainEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(11, "Jhon", "Lennon", 550);
        outputInfoAboutEmployee(employee);
    }

    static void outputInfoAboutEmployee(Employee employee) {
        System.out.println(employee.toString());
        System.out.println("Annual salary: " + employee.getAnnualSalary());
        System.out.println("Salary before increase: " + employee.getSalary());

        int increaseSalary = employee.raiseSalary(12);
        System.out.println("Salary after increase: " + increaseSalary);
    }
}
