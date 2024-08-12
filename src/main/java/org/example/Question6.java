package org.example;

import java.util.ArrayList;

public class Question6 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("purple");
        colors.add("Pink");
        colors.add("Brown");
        colors.add("Black");

        System.out.println("Element before being removed: " + colors);
        colors.remove(3);
        System.out.println("Elements after being removed: " + colors);


    }
    }
