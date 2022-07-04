package com.homework.homework14.tax;

public class RealEstate {
    protected double totalArea;
    protected double tax;

    public RealEstate(double totalArea, double tax) {
        this.totalArea = totalArea;
        this.tax = tax;
    }

    public double сalculateTax() {
        return totalArea * tax;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "totalArea = " + totalArea +
                ", tax = " + tax +
                '}';
    }
}
