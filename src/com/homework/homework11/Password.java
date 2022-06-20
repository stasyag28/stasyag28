package com.homework.homework11;

import java.util.Random;

public class Password {
    public static final String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String lowerChars = "abcdefghijklmnopqrstuvwxyz";
    public static final String numbers = "1234567890";
    public static final String specialChars = "_";

    public static void main(String[] args) {
        int passwordSize = 8;
        boolean upperCase = true;
        boolean lowerCase = true;
        boolean useNumbers = true;
        boolean specialSymbol = true;
        String password = generatePassword(passwordSize, upperCase, lowerCase, useNumbers, specialSymbol);
        System.out.println(password);
    }
    public static String generatePassword(int passwordSize, boolean upperCase, boolean lowerCase, boolean useNumbers, boolean specialSymbol) {
        char[] password = new char[passwordSize];
        String symbolSat = null;
        Random random = new Random();

        if (upperCase) symbolSat += upperChars;
        if (lowerCase) symbolSat += lowerChars;
        if (useNumbers) symbolSat += numbers;
        if (specialSymbol) symbolSat += specialChars;

        for (int i = 0; i < passwordSize; i++) {
            assert symbolSat != null;
            password[i] = symbolSat.toCharArray()[random.nextInt(symbolSat.length() - 1)];
        }
        return String.valueOf(password);
    }
}
