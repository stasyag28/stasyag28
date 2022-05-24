package com.homework.homework6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apples {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи количество яблок");
        int numberApples = Integer.parseInt(bufferedReader.readLine());
        int bigJarApple = 5;
        int averageJarApple = 3;
        int bigJar = DetermineNumberApples(numberApples, bigJarApple);
        System.out.println("Количество больших банок - " + bigJar );
        int remainder = DetermineRemainderDivision(numberApples, bigJarApple);
        int averageJar = DetermineNumberApples(remainder, averageJarApple);
        System.out.println("Количестово средних банок - " + averageJar);
        int remainder1 = DetermineRemainderDivision(remainder, averageJarApple);
        System.out.println("Количестово малньких банок - " + remainder1);




    }

    public static int DetermineNumberApples(int apple, int jar) {
        return apple / jar;

    }

    public static int DetermineRemainderDivision(int apple, int jar) {
        return apple % jar;
    }
}
