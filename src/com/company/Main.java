/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.*;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);

        int length = 0;
        int width = 0;
        System.out.println("What is the length in the room in feet?");
        length = jb.nextInt();
        System.out.println("What is the width in the room in feet?");
        width = jb.nextInt();
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
        int area = length * width;
        System.out.println("The area is " + area + " square feet");
        DecimalFormat jb2 = new DecimalFormat("#,###,##0.000");

        double sqmtrs = area * 0.09290304;
        System.out.println(jb2.format(sqmtrs) + " square meters");
    }
}
