package com.homework.homework13;

public class PersonTest {
    private static String[] NAMES = {"Дмитрий", "Анна", "Денис", "Елена", "Мария", "Петр"};
    private static String[] SURNAMES = {"Шевченко", "Петренко", "Василенко", "Сергиенко", "Андриенко", "Павленко"};

    public static void main(String[] args) {
        int size = 100;
        Person[] people = createPersons(size);
        printPeople(people);
    }

    public static int fillPersonInt(int min, int max) {

        return (int) (Math.random() * (max - min) + min);
    }

    public static String fillPersonString(String[] strings) {
        int i = (int) (Math.random() * strings.length);

        return strings[i];
    }

    public static Person[] createPersons(int size) {
        Person[] people = new Person[size];
        for (int i = 0; i < people.length; i++) {
            String name = fillPersonString(NAMES);
            String surname = fillPersonString(SURNAMES);
            int age = fillPersonInt(18, 50);
            int weight = fillPersonInt(60, 90);
            int height = fillPersonInt(160, 180);
            Person human = new Person(name, surname, age, weight, height);
            people[i] = human;
        }
        return people;
    }

    public static void printPeople(Person[] people) {

        for (Person human : people) {
            System.out.println(human);
        }
    }

}
