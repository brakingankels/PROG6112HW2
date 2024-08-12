package org.example;

import java.util.ArrayList;

public class Question5 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("purple");
        colors.add("Pink");
        colors.add("Brown");
        colors.add("Black");
        colors.add("Grey");

        System.out.println("Colours before set: " + colors);
        colors.set(2, "Maroon");
        colors.set(0, "White");
        System.out.println("Element in array: " + colors);

    }
}
