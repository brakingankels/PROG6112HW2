package org.example;

import java.util.ArrayList;

public class Question16 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Green");

        System.out.println("Original array list: " + colors);
        ArrayList<String> newColors = (ArrayList<String>)colors.clone();
        System.out.println("Cloned array list: " + newColors);
    }
}
