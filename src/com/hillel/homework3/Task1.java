package com.hillel.homework3;


import java.sql.SQLOutput;

public class Task1 {
    public static void main(String[] args) {

        //Дети слепили снеговика из 3х идеальной формы шаров снега. Шары получились радиусами 1м, 0.5м и 0.2м.
        //Учитывая, что коэффициент плотности снежных шаров равен 0.7кг/м3

        double r1 = 1;
        double r2 = 0.5;
        double r3 = 0.2;
        double d = 0.7;
        double v1 = (double) 4 / 3 * Math.PI * Math.pow(r1, 3);
        double v2 = (double) 4 / 3 * Math.PI * Math.pow(r2, 3);
        double v3 = (double) 4 / 3 * Math.PI * Math.pow(r3, 3);
        double m1 = d * r1;
        double m2 = d * r2;
        double m3 = d * r3;
        System.out.println("Вес снеговика - " + m1 + m2 + m3);


        //Объем шара - 4/3*pi*r^3


    }
}







