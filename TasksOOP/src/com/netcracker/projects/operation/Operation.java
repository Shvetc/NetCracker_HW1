package com.netcracker.projects.operation;

public interface Operation {
    static boolean IsComparable (double val1, double val2) {
        double accuracy = 1e-7;
        if (Math.abs(val1 - val2) < accuracy) {
            return  true;
        }
        return false;
    }
}
