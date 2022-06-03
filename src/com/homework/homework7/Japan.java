package com.homework.homework7;

public class Japan {
    public static void main(String[] args) {


        int notLuckyNumber1 = 4;
        int notLuckyNumber2 = 9;
        int i;
        for (i = 0; i <= 100; i++) {
            if (i % 10 == notLuckyNumber1 || i % 10 == notLuckyNumber2 || i / 10 == notLuckyNumber1 || i / 10== notLuckyNumber2) {
                continue;

            }
            System.out.println(i);


        }
    }
}
