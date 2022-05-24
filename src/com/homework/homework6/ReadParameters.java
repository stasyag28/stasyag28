package com.homework.homework6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadParameters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи число");
        int number1 = Integer.parseInt(reader.readLine());
        System.out.println("Введи операцию");
        char operation = reader.readLine().charAt(0);
        System.out.println("Введи число");
        int number2 = Integer.parseInt(reader.readLine());
        if (number2 == 0 && operation == '/') {
            System.out.println("Oшибка! Делить на 0 нельзя!");
            return;

        }
        int result = (calc(number1, operation, number2));
        System.out.println("Результат: " + result);


    }

    public static int calc(int number1, char operation, int number2) {
        int result = 0;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Ошибка. Повторите ввод.");

        }

        return result;
    }
}

