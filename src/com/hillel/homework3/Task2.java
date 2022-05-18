package com.hillel.homework3;

public class Task2 {
    public static void main(String[] args) {
//Найти результат выражения | a- b | / (a + b) ^3 - √c
        double a = 21;
        double b = 16;
        double c = 5;


        System.out.println (Math.abs (a- b) / Math.pow (a+b, 3) - Math.sqrt (c));

    }
}
