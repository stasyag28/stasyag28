package com.hillel.homework4;

public class Task2 {
    public static void main(String[] args) {

        int cat = 24;
        int dog = 8;
        int portion = 50;
        int portionsPerDay = 3;
        int moth = 30;
        int manyPortion = 2;
        int catFood = AnimalsFood(cat, 50, 3, 30);
        System.out.println("Cat food per month - " + catFood);
        int dogFood = AnimalsFood(dog, 50, 3, 30);
        System.out.println("Dog food per month - " + dogFood);
        int sum = PortionMonth(catFood, dogFood, 50);
        System.out.println("Money per month for the maintenance of the shelter - " + sum * manyPortion);


    }

    public static int AnimalsFood(int animals, int portionsPerDay, int portion, int month) {
        return (animals * portion * portionsPerDay * month);


    }

    public static int PortionMonth(int dogFood, int catFood, int portion) {
        return ((catFood + dogFood) / portion);


    }

}