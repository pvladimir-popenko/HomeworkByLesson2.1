package com.company;

public class CustomCar extends Car implements Printable {
    private String makersName;

    public CustomCar(String model, int year, String makersName) {
        setModel(model);
        setYear(year);
        this.makersName = makersName;


    }

    @Override
    public void print() {
        System.out.println(" You see " + getModel() + " is " + getYear() + " year of release " +
                " her creator name is " + makersName);
    }
}
