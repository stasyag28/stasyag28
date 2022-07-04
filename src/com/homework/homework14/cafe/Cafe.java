package com.homework.homework14.cafe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Cafe {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    static float PRICE_AMERICANO = 30.50F;
    static float PRICE_LATTE = 40.50F;
    static float PRICE_CAPPUCCINO = 40.50F;
    static float PRICE_TEA = 15.75F;

    public static void main(String[] args) throws IOException {
        ArrayList<Drinkable> drinkables = reedOrder();
        print(drinkables);
        System.out.println(drinkables);
        check(drinkables);

    }

    public static ArrayList<Drinkable> reedOrder() throws IOException {
        ArrayList<Drinkable> drinkables = new ArrayList<>();
        System.out.println("Для завершения заказа, напишите - Stop. Для продолжения заказа нажмите любую кнопку");
        while (!READER.readLine().equals("Stop")) {
            System.out.println("Виберите напиток: Americano, Latte, Cappuccino, Tea");
            String drinkable = READER.readLine();
            if (drinkable.equals("Americano") || drinkable.equals("Latte") ||
                    drinkable.equals("Cappuccino") || drinkable.equals("Tea")) {
                drinkables.add(createDrink(drinkable));
            } else {
                System.out.println("Напиток не найден! Повторите попытку!");
                return reedOrder();
            }
            System.out.println("Для завершения заказа, напишите - Stop. Для продолжения заказа нажмите любую кнопку");
        }
        return drinkables;
    }

    public static Drinkable createDrink(String drinkable) {
        return switch (drinkable) {
            case "Americano" -> new Americano(PRICE_AMERICANO);
            case "Latte" -> new Latte(PRICE_LATTE);
            case "Cappuccino" -> new Cappuccino(PRICE_CAPPUCCINO);
            case "Tea" -> new Tea(PRICE_TEA);
            default -> null;
        };
    }

    public static void print(ArrayList<Drinkable> drinkables) {
        for (Drinkable drinkable : drinkables) {
            drinkable.ready();
        }
    }

    public static void check(ArrayList<Drinkable> drinkables) {
        float orderPrice = 0F;
        for (Drinkable drinkable : drinkables) {
            orderPrice += drinkable.getPrise();
        }
        System.out.println("Сумма заказа: " + orderPrice + " грн");
    }
}