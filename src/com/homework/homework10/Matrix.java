package com.homework.homework10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Matrix {
    public static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Введи количество рядков: ");
        int numbersRow = Integer.parseInt(reader.readLine());
        System.out.println("Введи количество столбцов: ");
        int numbersColumn = Integer.parseInt(reader.readLine());
        int[][] matrixSize = createAndFillMatrix(numbersRow, numbersColumn);
        System.out.println("Матрица");
        matrixConsoleOutput(matrixSize);
        int[][] transpose = new int[numbersColumn][numbersRow];
        transposeMatrix(matrixSize, transpose);
        System.out.println("Транспорированая Матрица");
        matrixConsoleOutput(transpose);

    }

    public static int[][] createAndFillMatrix(int numbersRow, int numbersColumn) throws IOException {
        System.out.println("Заполни матрицу числами: ");
        int[][] matrixSize = new int[numbersRow][numbersColumn];

        for (int i = 0; i < matrixSize.length; i++) {
            for (int j = 0; j < matrixSize[i].length; j++) {
                matrixSize[i][j] = Integer.parseInt(reader.readLine());
            }
        }
        return matrixSize;
    }

    public static void matrixConsoleOutput(int[][] matrixSize) {
        for (int[] matrix : matrixSize) {
            for (int size : matrix) {
                System.out.print(size + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transposeMatrix(int[][] matrixSize, int[][] transpose) {
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {

                transpose[i][j] = matrixSize[j][i];

            }

        }
        return transpose;
    }
}
