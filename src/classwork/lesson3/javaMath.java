package classwork.lesson3;

public class javaMath {

    public static void main(String[] args) {

        System.out.println(Math.PI);

        System.out.println(Math.sqrt(Math.PI));

        System.out.println(Math.pow(2, 8));

        float f1 = 78.987F;
        System.out.println(Math.round(f1));
        //16 cтрока, так делать не желательно, так как не понятно какой это тип и что за число
        System.out.println(Math.round(78.418));

        double random = Math.random();
        System.out.println("random " + random);

        int max = 50;
        int intRandom = (int) (random * 100);
        System.out.println("random int " + intRandom);

        int r = (int) (-50 + random * 100);
        System.out.println("random in range " + r);

        int min = -50;
        int r2 =  (int) ((random * (max - min)) + min);
        System.out.println(r2);

    }
}
