package com.netcracker.projects.tasks.horstmann.chapter3;

import com.netcracker.projects.validation.Validation;

import java.util.InputMismatchException;
import java.util.Objects;

public class Employee implements Measurable {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        Validation.validate(firstName);
        Validation.validate(lastName);
        Validation.validate(salary);

        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String getName() {
        return firstName + " " + lastName;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {
        Validation.validate(salary);
        this.salary = salary;
    }

    public String toString() {
        return "Employee[" +
                ", name=" + getName() +
                ", salary=" + salary +
                ']';
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    static public double average(Measurable[] objects) {
        if (objects == null) {
            throw new InputMismatchException("Objects are null");
        }
        double averageSalary = 0;
        for (Measurable object : objects) {
            averageSalary += object.getMeasure();
        }
        return objects.length != 0 ? averageSalary / objects.length : 0.0;
    }

    static public Measurable largest(Measurable[] objects) {
        if (objects == null) {
            throw new InputMismatchException("Objects are null");
        }
        double maxSalary = 0;
        int index = 0;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof Employee) {
                maxSalary = Math.max(objects[i].getMeasure(), maxSalary);
                if (Objects.equals(maxSalary, objects[i].getMeasure())) {
                    index = i;
                }
            }
        }
        return objects[index];
    }
}
