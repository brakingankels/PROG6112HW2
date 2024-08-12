package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Question 1. adding colours and printing them
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("purple");
        colors.add("Pink");
        // question 2. iterating through array
        for(String color: colors) {
            System.out.println(color);
            //question 3. adding an element in first postion.
            colors.add(1,"yellow");
            System.out.println("After element is added: " + colors);

        }

    }
    }
