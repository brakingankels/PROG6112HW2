package org.example;

import java.util.ArrayList;

public class Question21 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        System.out.println("Original array list: " + colors);

        String addColors = "Black";
        colors.set(1, addColors);

        int num= colors.size();
        System.out.println("Replace second element with 'Black'.");
        for (int i = 0;i<num;i++)
            System.out.println(colors.get(i));
    }
}
