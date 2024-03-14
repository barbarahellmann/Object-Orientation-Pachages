package org.example;

public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.fill("T-Shirt");
        washingMachine.turnOn();
        washingMachine.waitUntilFinish();
        String result = washingMachine.empty();
        System.out.println(result);
    }
}