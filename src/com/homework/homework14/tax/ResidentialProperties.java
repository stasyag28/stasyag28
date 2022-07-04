package com.homework.homework14.tax;

public class ResidentialProperties extends RealEstate {
    private double subsidies;


    public ResidentialProperties(double totalArea, double tax, double subsidies) {
        super(totalArea, tax);
        this.subsidies = subsidies;
    }

    @Override
    public double сalculateTax() {
        return super.сalculateTax() - (super.сalculateTax() * subsidies) / 100;

    }

    @Override
    public String toString() {
        return "ResidentialProperties{" +
                "subsidies = " + subsidies +
                ", totalArea = " + totalArea +
                ", tax = " + tax +
                '}';
    }
}


