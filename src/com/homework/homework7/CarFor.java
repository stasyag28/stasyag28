package com.homework.homework7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarFor {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Введи количество машин: ");
        int car = java.lang.Integer.parseInt(READER.readLine());

        for (int i = 1; i <= car; i++) {

            soapCar();
            washCar();
            dryCar();

            System.out.println("Машина № " + i + " помыта!");
        }

    }

    public static void soapCar() {
        System.out.println("Мылить машину ");
    }

    public static void washCar() {
        System.out.println("Мыть машину ");
    }

    public static void dryCar() {
        System.out.println("Сушить машину");
    }
}

