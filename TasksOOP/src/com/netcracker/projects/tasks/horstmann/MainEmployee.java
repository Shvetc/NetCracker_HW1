package com.netcracker.projects.tasks.horstmann;

import com.netcracker.projects.tasks.horstmann.chapter3.Employee;

public class MainEmployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Jhon", "Vebster", 100);
        employees[1] = new Employee("Klin", "Vender", 200);
        employees[2] = new Employee("Jarry", "Scott", 150);

        printInfoAboutEmployees(employees);
    }

    static void printInfoAboutEmployees(Employee[] employees) {
        System.out.println("Average salary among employees: " + Employee.average(employees));
        System.out.println(Employee.largest(employees).getName() + " has the highest salary");
    }
}
