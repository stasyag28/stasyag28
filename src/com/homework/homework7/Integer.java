package com.homework.homework7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Integer {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Угадай число от 0 до 10.");


        int inputNumber = java.lang.Integer.parseInt(READER.readLine());

        int randomNumber = (int) (Math.random() * 10);

        while (!(inputNumber == randomNumber)) {
            System.out.println("Не угадал! ");
            inputNumber = java.lang.Integer.parseInt(READER.readLine());
        }
        System.out.println("Угадал!");
    }
}

