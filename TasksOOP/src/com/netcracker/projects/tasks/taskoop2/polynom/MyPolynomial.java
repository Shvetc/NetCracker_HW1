package com.netcracker.projects.tasks.taskoop2.polynom;

import java.util.Arrays;
import java.util.InputMismatchException;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        if (coeffs == null) {
            throw new InputMismatchException("Coefficients are not found");
        }
        this.coeffs = new double[coeffs.length];
        for (int i = 0; i < this.coeffs.length; i++) {
            this.coeffs[i] = coeffs[i];
        }
    }

    public int getDegree() {
        int n = coeffs.length - 1;
        for (int i = 0; i < coeffs.length; i++) {
            if (Double.compare(coeffs[i], 0.0) != 0) {
                break;
            }
            n--;
        }
        return n;
    }

    @Override
    public String toString() {
        StringBuilder stringPolynomial = new StringBuilder();
        int length = this.coeffs.length - 1;
        for (int i = 0; i < coeffs.length; i++) {
            if (Double.compare(coeffs[i], 0.0) != 0) {
                stringPolynomial.append(coeffs[i]);
                stringPolynomial.append((length != 0) ? ((length != 1) ? "x^" : "x") : "");
                stringPolynomial.append((length == 1) ? "" : length);
                if (i + 1 < coeffs.length) {
                    stringPolynomial.append(length != 0 ? coeffs[i + 1] >= 0 ? "+" : "" : "");
                } else {
                    stringPolynomial.append("");
                }
            }
            length--;
        }
        return stringPolynomial.toString();
    }

    public double evaluate(double x) {
        double res = 0;
        int n = coeffs.length - 1;
        for (double coeff : coeffs) {
            res += coeff * Math.pow(x, n);
            n--;
        }
        return res;
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    public MyPolynomial add(MyPolynomial right) {
        if (right == null) throw new InputMismatchException("The right polynomial is not found");
        double[] coeffsNewPolynomial = getNewCoeffs(right);
        MyPolynomial aNewPolynomial = new MyPolynomial(coeffsNewPolynomial);
        return aNewPolynomial;
    }

    private double[] getNewCoeffs(MyPolynomial right) {
        int degrees = this.getDegree();
        int inputDegrees = right.getDegree();
        int degreeCounter = 0;
        int inputDegreeCounter = 0;
        int aNewLength = this.coeffs.length;
        if (right.getDegree() > this.getDegree()) {
            aNewLength += right.getDegree() - this.getDegree();
        }
        double[] aNewCoeffs = new double[aNewLength];
        for (int i = 0; i < aNewLength; i++) {
            if (degrees > inputDegrees) {
                aNewCoeffs[i] = this.coeffs[i];
                degrees--;
            } else if (degrees < inputDegrees) {
                aNewCoeffs[i] = right.coeffs[i];
                inputDegrees--;
            } else {
                aNewCoeffs[i] = this.coeffs[(this.getDegree() < right.getDegree()) ? inputDegreeCounter++ : i] +
                        right.coeffs[(this.getDegree() > right.getDegree()) ? degreeCounter++ : i];
            }
        }

        return aNewCoeffs;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int countCoeffs = right.coeffs.length;
        int countRightCoeffs = this.coeffs.length;
        double[] aNewCoeffs = new double[countCoeffs + countRightCoeffs - 1];
        for (int i = 0; i < countRightCoeffs; i++) {
            for (int j = 0; j < countCoeffs; j++) {
                aNewCoeffs[i + j] += coeffs[i] * right.getCoeffs()[j];
            }
        }
        MyPolynomial aNewPolynomial = new MyPolynomial(aNewCoeffs);
        return aNewPolynomial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPolynomial that = (MyPolynomial) o;
        return Arrays.equals(coeffs, that.coeffs);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coeffs);
    }
}
