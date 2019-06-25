package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Task 1
     /*   System.out.println("Enter radius of your flower bed:");
        int radius = Integer.parseInt(br.readLine()) ;
        double perimeter = 2 * 3.14 * radius;
        double square = 3.14 * Math.pow(radius, 2);
        System.out.println("Perimeter of flower bed is: " + perimeter);
        System.out.println("And square is: " + square);
*/

        //Task2
 /*       System.out.println("What's your name?");
        String name = br.readLine();
        System.out.println("Hi " + name + "! And where do u live?");
        String city = br.readLine();
        System.out.println("Nice to meet you " + name + " from " + city);
*/


        //Task3

        int c1 = 1, c2 = 3, c3 = 5;
        System.out.println("Enter call's time for each of 3 countries: ");
        int t1 = Integer.parseInt(br.readLine());
        int t2 = Integer.parseInt(br.readLine());
        int t3 = Integer.parseInt(br.readLine());
        int firstPrice = callPrice(c1, t1);
        int secondPrice = callPrice(c2, t2);
        int thirdPrice = callPrice(c3, t3);
        int summPrice = firstPrice + secondPrice + thirdPrice;
        System.out.println("You have to pay " + firstPrice  + " for first call, " + secondPrice + " for second call,"
                + thirdPrice + " for third call and " + summPrice + " for all talks!");

    }

    public static int callPrice (int a, int b){
        return a*b;
    }
}
