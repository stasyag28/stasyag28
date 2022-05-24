package com.homework.homework4;

public class Task1 {
    public static void main(String[] args) {
        printAirplaneInfo("Jet", "F-22 Raptor");
        printAirplaneInfo("Airliner", "Aerobus 737", 150);
        printAirplaneInfo("Airliner", "Boeing 777",200, 50);
    }

    public static void printAirplaneInfo(String type, String model) {
        System.out.println("Type plane - " + type + ", model - " + model);
    }

    public static void printAirplaneInfo(String type, String model, int placesEconomy) {
        System.out.println("Type plane - " + type + ", model - " + model + ", number of places in economy class - " + placesEconomy);
    }

    public static void printAirplaneInfo(String type, String model, int placesEconomy, int placesBusiness) {
        System.out.println("Type plane - " + type + ", model - " + model + ", number of places in economy class - " + placesEconomy + ", number of places in business class - " + placesBusiness);
    }
}
