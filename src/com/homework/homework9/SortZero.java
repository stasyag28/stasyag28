package com.homework.homework9;

import java.util.Arrays;

public class SortZero {

    public static void main(String[] args) {

        int arrayNumbers[] = {6, 0, 2, 0, -5, 0, 8, 0, 3};
        System.out.println(Arrays.toString(arrayNumbers));
        sort(arrayNumbers);

    }
    public static void sort (int[] arrayNumbers){

        for (int i = 0; i < arrayNumbers.length; i++) {
            for (int j = 0; j < arrayNumbers.length; j++) {

                if (arrayNumbers[i] == 0) {
                    int temp = arrayNumbers[j];
                    arrayNumbers[j] = arrayNumbers[i];
                    arrayNumbers[i] = temp;
                    temp++;

                }
            }
        }

        System.out.println(Arrays.toString(arrayNumbers));
    }
}
