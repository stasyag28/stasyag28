package com.homework.homework14.cafe;

public class Drinkable {
    protected float price;

    public void ready() {
        System.out.print("Ожидайте! Ваш напиток готовится ");
    }

    public Drinkable(float price) {
        this.price = price;

    }

    public float getPrise() {
        return price;
    }

    @Override
    public String toString() {
        return "Drinkable{" +
                "price=" + price +
                '}';
    }
}
