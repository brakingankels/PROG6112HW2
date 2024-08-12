package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Question9 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        ArrayList<String> nums = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("purple");
        colors.add("Pink");
        System.out.println("Colors: " + colors);
        nums.add("1");
        nums.add("2");
        nums.add("3");
        nums.add("4");
        System.out.println("Numbers: " + nums);
        Collections.copy(colors, nums);

        System.out.println("Copy colors to num,\nAfter copy:");
        System.out.println("colors: " + colors);
        System.out.println("numbers: " + nums);

    }
}
