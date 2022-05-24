package classwork.lesson4;

import java.util.Scanner;

public class Box {

    public static void main(String[] args) {
        //Рассчитать объем коробки width, height, depth

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input width, height, depth: ");
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int depth = scanner.nextInt();

        int volume = volumeBox (width, height, depth);
        System.out.println(volume);
        //как использовать в дальнейшем
        System.out.println(volumeBox (20,30,40));
    }

    public static int volumeBox(int width, int height, int depth) {
        return width * height * depth;

    }



}
