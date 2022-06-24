package com.homework.homework13;

public class FamilyTest {
    public static void main(String[] args) {

        Human father = new Human("Вася", null, null);
        Human mother = new Human("Маня", null, null);
        Human child = new Human("Степа", mother, father);

        System.out.println(father);
        System.out.println(mother);
        System.out.println(child);
    }
}
