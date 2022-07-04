package com.homework.homework14.cafe;

import com.homework.homework14.cafe.Drinkable;

public class Latte extends Drinkable {
    public Latte(float price) {
        super(price);
    }

    @Override
    public void ready() {
        super.ready();
        System.out.println("- Latte");
    }

    @Override
    public String toString() {
        return "Latte{" +
                "price=" + price +
                '}';
    }
}
