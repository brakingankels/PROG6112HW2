package org.example;

import java.util.ArrayList;
import java.util.List;

public class Question12 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Maroon");
        colors.add("purple");
        colors.add("Pink");

        System.out.println("Original list: " + colors);
        List<String> sub_List = colors.subList(0, 3);
        System.out.println("List of first three elements: " + sub_List);

    }
}
