package com.softserve;

import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int radius = 0;
        double pi = 3.14;

        System.out.println ("Enter the radius:");
        radius = scanner.nextInt ();


        System.out.println ("Perimeter of circle is:");
        System.out.println (pi * 2 * radius);

        System.out.println ("\n Area of circle is:");
        System.out.println (pi * radius * radius);


    }
}