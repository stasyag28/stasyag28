package classwork.lesson4;

public class MathodsTest {
    public static void main(String[] args) {

        int result = sum (1, 2);
        System.out.println("result " + result);

        int result2 = sum(result, 10);
        System.out.println("result2 " + result2);

        boolean even = isEven(18);
        System.out.println("even? " + even);

    }
    public static boolean isEven(int number) {
        if (number % 2 == 0) ;
        {
            return true;
        }
    }

        public static int sum ( int number1, int number2){
            int sum = number1 + number2;
            return sum;

        }


    }
