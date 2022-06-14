package com.homework.homework10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialOfNumber {
    public static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Введи число: ");
        int number = Integer.parseInt(reader.readLine());
        System.out.println(factorialNumber(number));
    }

    public static int factorialNumber(int number) {
        if (number <= 1) {
            return number;
        }
        return number * factorialNumber(number - 1);
    }

}
