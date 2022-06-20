package homework11;

public class CatMain {
    public static void main(String[] args) {

        Cat cat = new Cat("Bob", 3, 4, "british");
        System.out.println(cat);

        Cat cat1 = new Cat("Vasya", 5);
        System.out.println(cat1);

        System.out.println(cat.equals(cat1));
    }
}
