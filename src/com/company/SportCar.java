package com.company;

public class SportCar extends Car implements Printable {
    private double volume;

    public SportCar(String model, int year, double volume) {
        setModel(model);
        setYear(year);
        this.volume = volume;
    }

    @Override
    public void print() {
        System.out.println("This is " + getModel() + " is " + getYear() + " year of release " +
                " and her volume is: " + volume);
    }
}
