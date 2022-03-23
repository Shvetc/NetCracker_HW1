package com.netcracker.projects.tasks.taskoop.employee;

import com.netcracker.projects.validation.Validation;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        Validation.validate(id);
        Validation.validate(firstName);
        Validation.validate(lastName);
        Validation.validate(salary);

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {

        return salary;
    }

    public void setSalary(int salary) {
        Validation.validate(salary);
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        Validation.validate(percent);
        int increaseSalary = (int) (getSalary() + getSalary() * (double) percent / 100);

        return increaseSalary;
    }

    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", name=" + getName() +
                ", salary=" + salary +
                ']';
    }
}
