package org.example;

import java.util.ArrayList;

public class Question7 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("purple");
        colors.add("Pink");
        colors.add("Brown");
        colors.add("Black");

        System.out.println("Element before being removed: " + colors);
        if(colors.contains("purple")) {
            System.out.println("Found the element: " + colors);
        }else {
            System.out.println("There is no such element.");
        }
    }
}