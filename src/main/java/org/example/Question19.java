package org.example;

import java.util.ArrayList;

public class Question19 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Green");

        System.out.println("Original array list: " +colors);
        System.out.println("Trim size of array: ");
        colors.trimToSize();
        System.out.println(colors);
    }
}
