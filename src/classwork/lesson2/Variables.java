package classwork.lesson2;

public class Variables {
    public static void main(String[] args) {

        System.out.println("Variables:");

        byte myByte = 101;
        System.out.println("this is byte: " + myByte);

        short myShort = 30000;
        System.out.println("this is short: " + myShort);

        int result = myByte + myShort;
        System.out.println("this is result: " + result);

        int myInt = 365_789_654;
        System.out.println("this is int: " + myInt);

        long myLong = 100_000_000_000L;
        System.out.println("this is long: " + myLong);

        float myFloat = 39.098F;
        System.out.println("this is float: " + myFloat);

        double myDouble = 566688769999.0000776666;
        System.out.println("this is double: " + myDouble);

        boolean isValid = true;
        System.out.println("this is boolean: " + isValid);

        char myChar = 'u';
        System.out.println("this is char: " + myChar);

        char myNumericChar = 56756;
        System.out.println("this is char: " + myNumericChar);

        char ch3 = '\u0054';
        System.out.println("this is char: " + ch3);

        String string = "test";
        System.out.println("this is string: " + string);


    }
}
