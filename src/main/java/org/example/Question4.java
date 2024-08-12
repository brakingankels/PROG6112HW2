package org.example;

import java.util.ArrayList;

public class Question4 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("purple");
        colors.add("Pink");

        String element = colors.get(2);

        System.out.println("Element retrieved from index: " + colors);
    }
}
