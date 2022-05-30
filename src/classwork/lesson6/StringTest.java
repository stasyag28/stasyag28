package classwork.lesson6;

public class StringTest {
    public static void main(String[] args) {

        String s1 = "text";
        String s2 = s1;
        String s3 = "text";

        System.out.println(s1);
        System.out.println(s1.hashCode());

        System.out.println(s2);
        System.out.println(s2.hashCode());

        System.out.println(s3);
        System.out.println(s3.hashCode());
        System.out.println("Срвавнение ссылки ");
        System.out.println(s1 == s2);
// Правильно сравнивать значения
        System.out.println("Сравнение значения");
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
        System.out.println("text".equals(s2));
        System.out.println(s1.equals("text"));

        boolean result = !s1.equals(s2);
        if (!s1.equals(s2)) {
            System.out.println("not equals");
        }






    }
}
