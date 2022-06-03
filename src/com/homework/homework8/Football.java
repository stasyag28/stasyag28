package com.homework.homework8;

import java.util.Arrays;

public class Football {
    public static void main(String[] args) {

        int size = 11;
        int[] team1 = fillFootballPlayers(size);
        System.out.println(Arrays.toString(team1));
        int[] team2 = fillFootballPlayers(size);
        System.out.println(Arrays.toString(team2));
        double averageTeamAge1 = commandAverage(team1);
        double averageTeamAge2 = commandAverage(team2);
        compareTeams(averageTeamAge1, averageTeamAge2);

    }
    public static int[] fillFootballPlayers(int size) {
        int ageMin = 18;
        int ageMax = 45;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (ageMax - ageMin) + ageMin);

        }

        return array;

    }
    public static double commandAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum / array.length;
    }
    public static void compareTeams(double averageTeamAge1, double averageTeamAge2) {
        if (averageTeamAge1 > averageTeamAge2) {
            System.out.println("Средний возраст 1 команды больше 2 команды");

        } else if (averageTeamAge1 < averageTeamAge2) {
            System.out.println("Средний возраст 1 команды меньше 2 команды");

        } else {
            System.out.println("Средний возраст 1 и 2 команды равен");

        }
    }
}

