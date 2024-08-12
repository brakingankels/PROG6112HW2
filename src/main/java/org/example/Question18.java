package org.example;

import java.util.ArrayList;

public class Question18 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Green");
        colors.add("Pink");
        colors.add("White");
        System.out.println("Original array list: "+colors);
        colors.removeAll(colors);
        System.out.println("Array list after remove all elements: "+colors.isEmpty());


    }
}
