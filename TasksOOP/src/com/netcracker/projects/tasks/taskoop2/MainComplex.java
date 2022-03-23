package com.netcracker.projects.tasks.taskoop2;

import com.netcracker.projects.tasks.taskoop2.compex.MyComplex;

//Example work with methods class MyComplex
public class MainComplex {
    public static void main(String[] args) {
        MyComplex complex1 = new MyComplex(4.0, 5.0);
        MyComplex complex2 = new MyComplex(2.0, 3.0);

        outputInfoAboutComplex(complex1);
        outputInfoAboutComplex(complex2);

        outputInfoAboutOperation(complex1, complex2);
    }

    static void outputInfoAboutComplex(MyComplex complex) {
        System.out.println(complex.toString());
        System.out.println("Verification of the real part of the complex number: " + complex.isImaginary());
        System.out.println("Verification of the imaginary part of a complex number: " + complex.isImaginary());
        System.out.println("The complex number modulus: " + complex.magnitude());
        System.out.println("The complex number argument: " + complex.argument());
        System.out.println("The conjugate complex number: " + complex.conjugate() + "\n");
    }

    static void outputInfoAboutOperation(MyComplex complex1, MyComplex complex2) {
        System.out.println("Addition of complex numbers= " + complex1.addNew(complex2).toString());
        System.out.println("Subtraction of complex numbers= " + complex1.subtractNew(complex2).toString());
        System.out.println("Multiplication of complex numbers= " + complex1.multiply(complex2).toString());
        System.out.println("Division of complex numbers= " + complex1.divide(complex2).toString() + "\n");
    }
}
