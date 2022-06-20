package com.homework.homework11;

import java.util.Objects;

public class Cat {
    String name;
    int age;
    int weight;
    String breed;

    public Cat(String name, int age, int weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            final boolean b = Objects.equals(this.weight, cat.weight) && this.age == cat.age;
            return b;
        }
        return false;
    }

    public String toString() {
        return "Cat{" +
                "name='" + this.name + '\'' +
                ", age='" + this.age + '\'' +
                ", weight=" + this.weight +
                ", breed='" + this.breed + '\'' +
                '}';
    }
}