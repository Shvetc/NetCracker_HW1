package com.netcracker.projects.tasks.horstmann.chapter1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MagicSquare {
    public static int[][] getMatrix(List<String> str) {
        int n = str.size();
        int[][] matrix = new int[n][n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            String[] strNumbers = str.get(i).split(" ");
            for (String strNumber : strNumbers) {
                matrix[i][index++] = Integer.parseInt(strNumber);
            }
            index = 0;
        }
        return matrix;
    }

    public static boolean isMagicSquare(int[][] theMatrix) {
        int sumRow = 0;
        int sumColumn = 0;
        int sumMainDiagonal = 0;
        int sumSecondaryDiagonal = 0;
        int countRows = theMatrix[0].length - 1;
        int sizeN = theMatrix.length;
        int sizeM = theMatrix[0].length;
        if (sizeM != sizeN) {
            return false;
        }
        int magicValue = (int) ((sizeN) * (Math.pow(sizeN, 2) + 1) / 2);
        for (int i = 0; i < theMatrix.length; i++) {
            for (int j = 0; j < theMatrix[i].length; j++) {
                sumRow += theMatrix[i][j];
                sumColumn += theMatrix[j][i];
            }
            if ((sumRow != magicValue) || (sumColumn != magicValue)) {
                return false;
            }
            sumMainDiagonal += theMatrix[i][i];
            sumSecondaryDiagonal += theMatrix[countRows--][i];
            sumRow = 0;
            sumColumn = 0;
        }
        return (sumMainDiagonal == magicValue)
                && (sumSecondaryDiagonal == magicValue);
    }

    public static List<String> getStringMatrix() {
        System.out.print("Please, enter size of square matrix n*n : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("Please, enter rows of matrix throw enter :");
        List<String> strRows = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Scanner scannerStr = new Scanner(System.in);
            String strRow = scannerStr.nextLine();
            if (strRow.equals("")) {
                throw new InputMismatchException("Input string is not valid. You entered empty string");
            }
            strRows.add(strRow);
        }
        return strRows;
    }

    public static void printInfoAboutMatrix(boolean iSMagicSquare) {
        if (iSMagicSquare) {
            System.out.println("This matrix is Magic Square");
        } else {
            System.out.println("This matrix is not Magic Square");
        }
    }
}
