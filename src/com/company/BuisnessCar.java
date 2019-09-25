package com.company;

public class BuisnessCar extends Car implements Printable {
    private double comfortLevel;

    public BuisnessCar(String model, int year, double comfortLevel) {
        setModel(model);
        setYear(year);
        this.comfortLevel = comfortLevel;
    }


    @Override
    public void print() {
        System.out.println(" It's " + getModel() + " is " + getYear() + " year of release " + " her comfort level is "
                + comfortLevel);
    }
}