package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Lets Start!!!\n" +
                "     ------------------------------------------------------------\n");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the class name what you want to create\n Sport\n Buisness\n" +
                    "Custom");

            String className = scanner.nextLine();
            createObject(className);

        }


    }

    public static boolean isTrue(String condition) {
        if (condition == "y") {
            return true;
        } else {
            return false;
        }
    }

    public static Car createObject(String className) {

        switch (className) {
            case "buisness":
                BuisnessCar bc = new BuisnessCar("Bantley", 2018, 100500);
                bc.print();
                return bc;

            case "sport":
                SportCar sc = new SportCar("Aston Martin", 2009, 450);
                sc.print();
                return sc;

            case "custom":
                CustomCar cc = new CustomCar("Hot Road", 2019, "Jora");
                cc.print();
                return cc;
            default:
                System.out.println("Uncorrect Class Name");
                return null;
        }

    }
}
