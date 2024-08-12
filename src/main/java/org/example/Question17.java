package org.example;

import java.util.ArrayList;

public class Question17 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("White");
        colors.add("Pink");
        colors.add("Black");
        colors.add("Green");
        System.out.println("Original list: " + colors);
        colors.removeAll(colors);
        System.out.println("Array list, all elements removed: " + colors);
    }
}
