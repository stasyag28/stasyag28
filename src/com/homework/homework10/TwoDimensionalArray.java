package com.homework.homework10;

import java.util.Random;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        int sizeRow = 5;
        int sizeColumn = 5;
        int[][] array = createAndFillArray(sizeRow, sizeColumn);
        outputNegativeNumbers(array);
    }

    public static int[][] createAndFillArray(int sizeRow, int sizeColumn) {

        int max = 10;
        int min = -10;
        int[][] array = new int[sizeRow][sizeColumn];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * ((max - min) + 1) + min);
            }
        }
        return array;
    }

    public static void outputNegativeNumbers(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    System.out.print(array[i][j] + " index " + i + "" + j + "; ");
                }
            }
            System.out.println();
        }
    }
}
