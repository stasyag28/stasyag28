package classwork.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpringOverLoading {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String test1 = bufferedReader.readLine();
        String test2 = bufferedReader.readLine();

        printConcatenation(test1, test2);
        printConcatenation(test1, "any text");
        printConcatenation("something", test2);
        printConcatenation("1", "2");
        printConcatenation(bufferedReader.readLine(), bufferedReader.readLine());

        printConcatenation("test", 1);

    }
    public static void printConcatenation(String s1, String s2){
        System.out.println(s1 + s2);

    }
    public static void printConcatenation(String str1, int number){
        System.out.println(str1 + number);
    }
}
