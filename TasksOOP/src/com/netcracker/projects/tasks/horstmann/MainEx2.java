package com.netcracker.projects.tasks.horstmann;

import com.netcracker.projects.tasks.horstmann.chapter1.Normalization;

public class MainEx2 {
    public static void main(String[] args) {
        int anAngle = -90;
        printNormalizeAngle(anAngle);
    }

    static void printNormalizeAngle(int theAngle) {
        System.out.println("Normalization angle=" + theAngle + " degree with % operator:" +
                Normalization.normalizeDegree(theAngle) + " degree");
        System.out.println("=======================");
        System.out.println("Normalization angle=" + theAngle + " degree with math function FloorMod:" +
                Normalization.normalizeDegreeWithFloorMod(theAngle) + " degree");
    }
}
