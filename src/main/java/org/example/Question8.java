package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Question8 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("purple");
        colors.add("Pink");
        colors.add("Brown");
        colors.add("Black");

        System.out.println("ArrayList before being sorted: " + colors);
        Collections.sort(colors);
        System.out.println("List after being sorted: " + colors);
    }
}