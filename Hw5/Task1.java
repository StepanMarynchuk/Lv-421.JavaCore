package com.softserve;

import java.util.Scanner;


public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] month = {7, 28, 30, 30, 30, 31, 31, 30, 30, 31, 31, 30};
        int n = 1;
        System.out.println ("Input number of month");
        for (n = 1; n <= month.length; n++) {
            n = Integer.parseInt (sc.nextLine ());


            System.out.println ("Amount of days are" + " " + month[n - 1]);


        }
    }
}