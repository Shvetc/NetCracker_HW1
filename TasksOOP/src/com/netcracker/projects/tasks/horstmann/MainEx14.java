package com.netcracker.projects.tasks.horstmann;

import com.netcracker.projects.tasks.horstmann.chapter1.MagicSquare;

import java.util.List;

public class MainEx14 {
    public static void main(String[] args) {
        List<String> strMatrix = MagicSquare.getStringMatrix();
        int[][] matrix = MagicSquare.getMatrix(strMatrix);

        MagicSquare.printInfoAboutMatrix(MagicSquare.isMagicSquare(matrix));
    }
}
