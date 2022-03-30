package com.netcracker.projects.tasks.taskoop2;

import com.netcracker.projects.tasks.taskoop2.polynom.MyPolynomial;

//Example work with methods class MyPolynomial
public class MainPolynomial {
    public static void main(String[] args) {
        MyPolynomial polynomial = new MyPolynomial(1.0, 2.0, 1.0);
        MyPolynomial polynomial2 = new MyPolynomial(4.0, 1.0);
        
        outputInfoPolynomial(polynomial, polynomial2);
    }

    static void outputInfoPolynomial(MyPolynomial polynomial, MyPolynomial polynomial2) {
        System.out.println("Polynomial is " + polynomial);
        System.out.println("Polynomial2 is " + polynomial2 + "\n");

        MyPolynomial polynomial3 = polynomial.add(polynomial2);
        MyPolynomial polynomial4 = polynomial.multiply(polynomial2);

        System.out.println("Evaluate polynomial in (x = 2.0) :" + polynomial.evaluate(2.0));
        System.out.println("Evaluate polynomial2 in (x = 2.0) :" + polynomial.evaluate(3.0) + "\n");
        System.out.println(polynomial.toString() + "+" + polynomial2.toString() + "=" + polynomial3.toString());
        System.out.println("(" + polynomial.toString() + ")*(" + polynomial2.toString() + ")=" + polynomial4.toString());
    }
}
