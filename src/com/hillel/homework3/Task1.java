package com.hillel.homework3;


public class Task1 {
    public static void main(String[] args) {

        //Дети слепили снеговика из 3х идеальной формы шаров снега. Шары получились радиусами 1м, 0.5м и 0.2м.
        //Учитывая, что коэффициент плотности снежных шаров равен 0.7кг/м3

        double a = 1;
        double b = 0.5;
        double c = 0.2;
        double d = 0.7;
        double ball1 = 1.0775662801812989;
        double ball2 = 0.13469578502266236;
        double ball3 = 0.008620530241450392;



                //Объем шара - 4/3*pi*r^3

        System.out.println  ("ball1 - " + 4 / 3 * Math.PI * Math.pow (a, 3) * Math.pow (d, 3));
        System.out.println  ("ball2 - " + 4 / 3 * Math.PI * Math.pow (b, 3) * Math.pow (d, 3));
        System.out.println  ("ball3 - " + 4 / 3 * Math.PI * Math.pow (c, 3) * Math.pow (d, 3));
        System.out.println("Вес снеговика - " + ball1 + ball2 + ball3);

    }




}
