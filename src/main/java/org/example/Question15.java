package org.example;

import java.util.ArrayList;

public class Question15 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        ArrayList<String> colors2 = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");
        colors2.add("Green");
        colors2.add("Maroon");
        colors2.add("purple");
        System.out.println("First arraylist: " + colors);
        System.out.println("Second arraylist: " + colors2);

        // joins the two above arraylist
        ArrayList<String> i = new ArrayList<String>();
        i.addAll(colors);
        i.addAll(colors2);
        System.out.println("Joined array: " + i);
    }
}
