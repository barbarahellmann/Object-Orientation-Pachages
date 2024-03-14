package de.neuefische.laundry;

import java.util.Objects;

public class WashingMachine {
    private String contents = "";
    private boolean clean = true;

//    public boolean getClean() {
//        return clean;
//    }
////
//    public void setClean(boolean clean) {
//        this.clean = clean;
//    }
//
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

    public String toString() {
        String text = "Eine Waschmaschine, sie ist ";
        if (clean) {
            text += "Sauber";
        } else {
            text += "schmutzig";
        }
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WashingMachine that = (WashingMachine) o;
        return clean == that.clean && Objects.equals(contents, that.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contents, clean);
    }
}
