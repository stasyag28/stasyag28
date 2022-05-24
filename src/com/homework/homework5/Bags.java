package com.homework.homework5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bags {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи высоту багажа");
        int height = Integer.parseInt(reader.readLine());
        System.out.println("Введи ширину багажа");
        int width = Integer.parseInt(reader.readLine());
        System.out.println("Введи длину багажа");
        int length = Integer.parseInt(reader.readLine());
        boolean flag = isBaggageDimensions(height, width, length);
        String massage = flag ? "Багаж подходит по габаритам" : "Багаж не подходит по габаритам";
        System.out.println(massage);


    }

    public static boolean isBaggageDimensions(int height, int width, int length) {

        int heightBag = 40;
        int widthBag = 20;
        int lengthBag = 55;
        int heightSuitcase = 53;
        int widthSuitcase = 22;
        int lengthSuitcase = 40;

        if (heightBag >= height && widthBag >= width && lengthBag >= length ||
                heightSuitcase >= height && widthSuitcase >= width && lengthSuitcase >= length) {
            return true;
        }
        return false;

    }

}


