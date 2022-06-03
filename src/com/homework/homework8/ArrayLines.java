package com.homework.homework8;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayLines {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи 20 строк");

        int size = 20;
        String[] lines = new String[size];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = in.next();

        }
        String[] lines1 = Arrays.copyOfRange(lines, 0, lines.length / 2);
        String[] lines2 = Arrays.copyOfRange(lines, lines.length / 2, lines.length);


        System.out.println(Arrays.toString(lines));
        System.out.println(Arrays.toString(lines1));
        System.out.println(Arrays.toString(lines2));
    }


}