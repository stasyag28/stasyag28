package com.hillel.homework5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scholarships {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введи оценку по георафии");
        int geography = Integer.parseInt(reader.readLine());
        System.out.println("введи оценку по  истории");
        int history = Integer.parseInt(reader.readLine());
        System.out.println("введи оценку по математике");
        int mathematics = Integer.parseInt(reader.readLine());
        System.out.println("введи оценку по биологии");
        int biology = Integer.parseInt(reader.readLine());
        System.out.println("введи оценку по экономике");
        int economy = Integer.parseInt(reader.readLine());
        calculateScholarship(defineOfTheSameValue(geography,history,mathematics, biology, economy));


    }


    public static int defineOfTheSameValue(int geography, int history, int mathematics, int biology, int economy) {
        return (geography + history + mathematics + biology + economy) / 5;
    }

    public static void calculateScholarship(int sameValue) {

        int increased = 10;
        int ordinary = 8;

        if (sameValue >= increased) {
            System.out.println("Повышеная степендия");
        } else if (sameValue >= ordinary) {
            System.out.println("Обычная степендия");

        } else {
            System.out.println("Без степендии");

        }
    }
}







