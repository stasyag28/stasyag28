package classwork.lesson10;

public class MultiArray2d {

    public static void main(String[] args) {

        int[][] arr = new int[2][3];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][i] = i * j;
                System.out.print("(" + i + ", " + j + "): has value" + arr[i][j] + ";");

            }
            System.out.println();

        }

    }
}
