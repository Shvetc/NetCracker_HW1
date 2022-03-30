package com.netcracker.projects.tasks.taskoop2.compex;

import com.netcracker.projects.operation.Operation;

import java.util.InputMismatchException;

public class MyComplex {
    double real;
    double imag;

    public MyComplex() {
        real = 0;
        imag = 0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + (imag >= 0 ? '+' : "") + imag + 'i' + ")";
    }

    public boolean isReal() {
        return real != 0;
    }

    public boolean isImaginary() {
        return imag != 0;
    }

    public boolean equales(double real, double imag) {
        return Operation.IsComparable(this.real, real) && Operation.IsComparable(this.imag, imag);
    }

    public boolean equales(MyComplex another) {
        return equales(another.getReal(), another.getImag());
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }

    public double argument() {
        if (isReal()) {
            return Math.atan(imag / real);
        }
        throw new InputMismatchException("Real part is null");
    }

    public MyComplex add(MyComplex right) {
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        double aNewReal = real + right.getReal();
        double aNewImag = imag + right.getImag();
        MyComplex aNewComplex = new MyComplex(aNewReal, aNewImag);
        return aNewComplex;
    }

    public MyComplex substract(MyComplex right) {
        this.real -= right.getReal();
        this.imag -= right.getImag();
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        double aNewReal = real - right.getReal();
        double aNewImag = imag - right.getImag();
        MyComplex aNewComplex = new MyComplex(aNewReal, aNewImag);
        return aNewComplex;
    }

    public MyComplex multiply(MyComplex right) {
        this.real = this.real * right.getReal() - this.imag * right.getImag();
        this.imag = this.real * right.getImag() + right.getReal() * this.imag;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        if (!Operation.IsComparable(right.real, 0) && !Operation.IsComparable(right.imag, 0)) {
            double divider = (Math.pow(right.imag, 2) + Math.pow(right.real, 2));
            this.real = (this.real * right.real + this.imag * right.imag) / divider;
            this.imag = (this.real * this.imag - this.real * right.imag) / divider;
            return this;
        }
        throw new InputMismatchException("The right complex is null");
    }

    public MyComplex conjugate() {
        MyComplex complexConjugate = new MyComplex(this.real, (-1) * this.imag);
        return complexConjugate;
    }
}
