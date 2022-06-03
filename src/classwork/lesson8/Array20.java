package classwork.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array20 {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Введи 20 строк");

        int size = 20;

        String[] lines = fillArray(size);
        String[] lines1 = new String[size / 2];
        String[] lines2 = new String[size / 2];


        System.out.println(Arrays.toString(lines));


    }


    public static String[] fillArray(int size) throws IOException {
        String[] array = new String[size];


        for (int i = 0; i < array.length; i++) {

            array[i] = new String(READER.readLine());

        }

        return array;
    }
}