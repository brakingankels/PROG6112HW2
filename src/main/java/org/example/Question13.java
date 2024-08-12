package org.example;

import java.util.ArrayList;

public class Question13 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        ArrayList<String> colors2 = new ArrayList<String>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");

        colors2.add("Maroon");
        colors2.add("purple");
        colors2.add("Pink");
        ArrayList<String> container = new ArrayList<String>();

        //Storing the comparison output in ArrayList<String>
        for (String e : colors2)
            container.add(colors2.contains(e) ? "Yes" : "No");
        System.out.println(container);




    }
}
