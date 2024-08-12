package org.example;

import java.util.ArrayList;

public class Question22 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Green");
        System.out.println("Original array list: " + colors);
        System.out.println("\nPrinting Using index of element: ");
        int numOfElements = colors.size();
        for (int i = 0; i < numOfElements; i++)
        System.out.println(colors.get(i));
    }
}
