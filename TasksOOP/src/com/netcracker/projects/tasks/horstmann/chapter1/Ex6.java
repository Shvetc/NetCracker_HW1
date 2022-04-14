package com.netcracker.projects.tasks.horstmann.chapter1;

import java.math.BigInteger;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println("1000! =" + factorial(BigInteger.valueOf(1000)));
    }

    static BigInteger factorial(BigInteger n) {
        BigInteger aValue = BigInteger.valueOf(1);
        for (int i = 1; i < n.intValue(); i++) {
            aValue = aValue.add(aValue.multiply(BigInteger.valueOf(i)));
        }
        return aValue;
    }
}
