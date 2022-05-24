package com.homework.homework2;

public class Variable {
    public static void main(String[] args) {

        int a = 10;
        System.out.println("a " + a);

        int  b = 20;
        System.out.println("b " + b);

        a = a + b;

        b = a - b;
        System.out.println("b = " +b);

        a = a - b;
        System.out.println("a = " +a);

    }
}
