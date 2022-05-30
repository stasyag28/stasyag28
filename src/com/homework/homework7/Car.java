package com.homework.homework7;
/* Додаткова задача:
Миття машини відбувається в 3 етапи - намилити машину, помити, висушити. Кожен етап миття винесіть в метод.
Користувач задає кількість машин, які треба помити.
Вам треба мити машини поки всі не будуть вимиті.
Вирішіть цю задачу 2 способами - з циклом for та з циклом while
/**
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Введи количество машин: ");
        int car = java.lang.Integer.parseInt(READER.readLine());

        int i = 1;
        while (i <= car) {
            soapCar();
            washCar();
            dryCar();
            i++;
            System.out.println("Машина № " + (i - 1) + " помыта!");
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
