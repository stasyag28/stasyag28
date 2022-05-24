package com.homework.homework6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи число 1");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введи число 2");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Введи число 3");
        int c = Integer.parseInt(reader.readLine());
        System.out.println("Минимальное число - " + min(a, b, c));


    }

    public static int min(int a, int b, int c) {
        int m = a;
        if (b < m) m = b;
        if (c < m) m = c;

        return m;
    }
}
