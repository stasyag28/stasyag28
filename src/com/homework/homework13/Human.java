package com.homework.homework13;

public class Human {
    private final String name;
    private final Human mother;
    private final Human father;

    public Human(String name, Human mother, Human father) {
        this.name = name;
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {
     StringBuilder builder = new StringBuilder();

        builder.append(" Имя человека - ").append(name);
        if (mother == null) {
           builder.append(" ");
        } else {
            builder.append(" Мать - ").append(mother);

        }
        if (father == null) {
            builder.append(" ");
        } else {
            builder.append(" Отец - ").append(father);

        }
        return builder.toString();
    }
}

