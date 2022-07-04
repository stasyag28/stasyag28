package com.homework.homework14.tax;

import java.util.ArrayList;

public class PropertyTaxes {
    static double TOTAL_AREA_HOME = 120.78;
    static double SUBSIDIES_HOME = 5;
    static double TOTAL_AREA_SHOP = 340.08;
    static double REVENUE = 757.78;
    static double TOTAL_AREA_FACTORY = 1290.90;
    static double TAX = 40.50;

    public static void main(String[] args) {
        ArrayList<RealEstate> immovables = new ArrayList<>();
        RealEstate home = new ResidentialProperties(TOTAL_AREA_HOME, TAX, SUBSIDIES_HOME);
        immovables.add(home);
        RealEstate shop = new CommercialRealEstate(TOTAL_AREA_SHOP, TAX, REVENUE);
        immovables.add(shop);
        RealEstate factory = new IndustrialRealEstate(TOTAL_AREA_FACTORY, TAX);
        immovables.add(factory);
        print(immovables);

    }

    public static void print(ArrayList<RealEstate> immovables) {
        for (RealEstate realEstate : immovables) {
            double sumTax = realEstate.сalculateTax();
            double scale = Math.pow(10, 2);
            double result = Math.ceil(sumTax * scale) / scale;

            System.out.println(realEstate + " Ваш налог: " + result + " грн");

        }
    }
}

