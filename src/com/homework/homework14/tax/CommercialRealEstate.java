package com.homework.homework14.tax;

public class CommercialRealEstate extends RealEstate {
    private double tradeProceeds;

    public CommercialRealEstate(double totalArea, double tax, double tradeProceeds) {
        super(totalArea, tax);
        this.tradeProceeds = tradeProceeds;
    }

    @Override
    public double сalculateTax() {
        double commercialTax = super.сalculateTax();
        if (tradeProceeds < 100){
            System.out.println("Налог не взымается.");
            return commercialTax = 0;
        }
        return commercialTax;
    }

    @Override
    public String toString() {
        return "CommercialRealEstate{" +
                "tradeProceeds = " + tradeProceeds +
                ", totalArea = " + totalArea +
                ", tax = " + tax +
                '}';
    }
}
