package com.hillel.lesson4;

public class Methods {

    public static void main(String[] args) {
        // тут методы не создаем

        printMassage();
        int number = generateRandom();
        System.out.println(number);
        int randomInt = generateRandom(18, 50);
        System.out.println(randomInt);
        printMassage("test");

    }

    public static void printMassage() {
        System.out.println("massage");
    }
    public static void printMassage(String massage) {
        System.out.println(massage);
    }
    public static int generateRandom() {
        return (int) (Math.random() * 100);

    }

        public static int generateRandom(int min, int max) {
        return (int) (Math.random() * (max - min) + min);

        }


}
// тут методы не создаем
