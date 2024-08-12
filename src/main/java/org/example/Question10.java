package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Question10 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("purple");
        colors.add("Pink");

        System.out.println("List before being sorted:\n" + colors);
        Collections.shuffle(colors);
        System.out.println("List after being sorted:\n" + colors);
    }
}
