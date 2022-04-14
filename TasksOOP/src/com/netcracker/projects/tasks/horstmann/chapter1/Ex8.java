package com.netcracker.projects.tasks.horstmann.chapter1;

import java.util.InputMismatchException;

public class Ex8 {
    public static void main(String[] args) {
        String aString = "netcracker";
        printSubStrings(aString);
    }

    static void printSubStrings(String str) {
        if (str == null || str.equals("")) {
            throw new InputMismatchException("The string is not valid");
        }
        int sizeString = str.length();
        for (int i = 0; i < sizeString; i++) {
            for (int j = 1; j <= sizeString - i; j++) {
                System.out.println(str.substring(i, i + j));
            }
        }
    }
}
