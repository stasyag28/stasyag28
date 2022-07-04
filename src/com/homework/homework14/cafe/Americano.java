package com.homework.homework14.cafe;

public class Americano extends Drinkable {
    public Americano(float price) {
        super(price);
    }

    @Override
    public void ready() {
        super.ready();
        System.out.println("- Americano");
    }

    @Override
    public String toString() {
        return "Americano{" +
                "price=" + price +
                '}';
    }
}
