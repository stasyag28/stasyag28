package com.homework.homework14.cafe;

public class Cappuccino extends Drinkable {
    public Cappuccino(float price) {
        super(price);
    }

    @Override
    public void ready() {
        super.ready();
        System.out.println("- Cappuccino");
    }

    @Override
    public String toString() {
        return "Cappuccino{" +
                "price=" + price +
                '}';
    }
}
