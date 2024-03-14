package org.example;

public class WashingMachine {
    private String contents = "";
    private boolean clean = true;

    public void fill(String item) {
        contents += item + ", ";
        clean = false;
    }

    public void turnOn() {
    }

    public void waitUntilFinish() {
        clean = true;
    }

    public String empty() {
        String result = "";
        if (clean) {
            result += "Clean";

        } else {
            result += "Dirty";
        }
        result += "";
        result += contents.substring(0, contents.length() - 2);
        return result;
    }
}
