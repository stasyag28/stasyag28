package classwork.lesson3;

public class TupeCasting {
    public static void main(String[] args) {

        byte b = 127;
        System.out.println("byte " +b);

        short sh = b;
        System.out.println("short " +sh);

        int i = 2_000_000;
        System.out.println("int " +i);

        b = (byte) i;
        System.out.println("byte " +b);


        b = 127;
        b = (byte) (b + 1);
        System.out.println("byte +1 " + b);

        float f = 34.67F;

        byte FloatToByte = (byte) f;
        System.out.println("FloatToByte " +FloatToByte);



    }
}
