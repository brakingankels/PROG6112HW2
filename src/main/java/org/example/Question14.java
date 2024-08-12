package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Question14 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Maroon");
        colors.add("purple");

        System.out.println("Array list before Swap:");
        for (String x : colors) {
            System.out.println(x);
        }
        //Swapping 1s element with the 3rd element
        Collections.swap(colors, 0, 2);
        System.out.println("Array list after swap:");
        for (String y : colors) {
            System.out.println(y);
        }
    }
}
