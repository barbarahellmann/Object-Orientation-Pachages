package de.neuefische.laundry;

public class WashingMachine {
    private String contents = "";
    private boolean clean = true;
    public boolean getClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

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
        if (contents.isEmpty()){
            return "Nothing";
        }
        if (clean) {
            result += "Clean";

        } else {
            result += "Dirty";
        }
        result += "";
        result += contents.substring(0, contents.length() - 2);
        contents = "";
        return result;
    }
}
