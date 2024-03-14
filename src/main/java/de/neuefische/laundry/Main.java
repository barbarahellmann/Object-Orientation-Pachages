package de.neuefische.laundry;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.fill("T-Shirt");
        System.out.println(washingMachine);
        washingMachine.turnOn();
        washingMachine.waitUntilFinish();
        String result = washingMachine.empty();
        System.out.println(result);
    }
}