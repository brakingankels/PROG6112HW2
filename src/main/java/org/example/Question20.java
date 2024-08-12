package org.example;

import java.util.ArrayList;

public class Question20 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Green");
        System.out.println("Original array list: " + colors);
        colors.ensureCapacity(9);
        colors.add("White");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Yellow");
        System.out.println("New array list: "+ colors);

    }
}
