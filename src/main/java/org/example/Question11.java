package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Question11 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("purple");
        colors.add("Pink");

        System.out.println("List before being reversed:\n" + colors);
        Collections.reverse(colors);
        System.out.println("List after being reversed:\n" + colors);
    }
}
