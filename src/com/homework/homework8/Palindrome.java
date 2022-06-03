package com.homework.homework8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Palindrome {
    public static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Введи фразу: ");
        String palindrome = reader.readLine();
        palindrome = palindrome.replaceAll(" ", "");
        palindrome = palindrome.toLowerCase(Locale.ROOT);

        int stringLength = palindrome.length();
        String result = reverseStringWithCharAt(palindrome, stringLength);
        String total = isPalindrome(palindrome, result) ? "Это Палиндром" : "Это не Палиндром";
        System.out.println(total);

    }
    public static String reverseStringWithCharAt(String palindrome, int stringLength) {

        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = palindrome.charAt(i) + result;
        }
        return result;
    }
    public static boolean isPalindrome(String palindrome, String result) {
        if (!palindrome.equals(result)) {
            return false;
        }
        return true;
    }
}




