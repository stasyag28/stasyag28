package classwork.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Validate {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());

        if (number % 2 != 0) {
            System.out.println("error number is invalid: "+ number);
            return;
        }
        System.out.println("you are win!");
    }

}
