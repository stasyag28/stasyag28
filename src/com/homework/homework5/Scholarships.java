package com.homework.homework5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scholarships {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введи оценку по георафии");
        double geography = Double.parseDouble(reader.readLine());
        System.out.println("введи оценку по  истории");
        double history = Double.parseDouble(reader.readLine());
        System.out.println("введи оценку по математике");
        double mathematics = Double.parseDouble(reader.readLine());
        System.out.println("введи оценку по биологии");
        double biology = Double.parseDouble(reader.readLine());
        System.out.println("введи оценку по экономике");
        double economy = Double.parseDouble(reader.readLine());
        calculateScholarship(defineOfTheSameValue(geography, history, mathematics, biology, economy));


    }


    public static double defineOfTheSameValue(double geography, double history, double mathematics, double biology, double economy) {
        return (geography + history + mathematics + biology + economy) / 5;
    }

    public static void calculateScholarship(double sameValue) {

        double increased = 10;
        double ordinary = 8;

        if (sameValue >= increased) {
            System.out.println("Повышеная степендия");
        } else if (sameValue >= ordinary) {
            System.out.println("Обычная степендия");

        } else {
            System.out.println("Без степендии");

        }
    }
}







