package com.homework.homework14.cafe;

import com.homework.homework14.cafe.Drinkable;

public class Tea extends Drinkable {
    public Tea(float price) {
        super(price);
    }

    @Override
    public void ready() {
        super.ready();
        System.out.println("- Tea");
    }

    @Override
    public String toString() {
        return "Tea{" +
                "price=" + price +
                '}';
    }
}
