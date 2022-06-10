package com.homework.homework9;

import java.io.IOException;
import java.util.*;

public class Lottery {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int size = 7;
        int max = 9;
        int min = 0;
        int firstRandom[] = new int[size];
        for (int i = 0; i < firstRandom.length; i++) {
            firstRandom[i] = (int) (Math.random() * ((max - min) + 1) + min);
        }

        System.out.println("Введи 7 цифр от 0 до 9: ");
        int secondConsole[] =  createAndFill(size);
        Arrays.sort(firstRandom);
        Arrays.sort(secondConsole);
        System.out.println(Arrays.toString(firstRandom));
        System.out.println(Arrays.toString(secondConsole));
        compare(firstRandom, secondConsole);

    }
    public static int[] createAndFill (int size) {
        int secondConsole[] = new int[size];
        for (int i = 0; i < secondConsole.length; i++) {
            secondConsole[i] = in.nextInt();
        }
        return secondConsole;
    }
    public static void compare (int[] firstLottery, int[]secondConsole){

        List<Integer> coincidence;
        for (int i = 0; i < firstLottery.length; i++) {
            if (firstLottery[i] == secondConsole[i]){
                coincidence = Collections.singletonList(firstLottery[i]);
                System.out.print("Совпало число" + Arrays.toString(new List[]{coincidence}));

            }

        }
    }
}
