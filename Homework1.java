package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main {

    public static void main(String[] args) throws IOException {
	/* Flower bed is shaped like a circle. Calculate the perimeter and area by entering the radius.
         Output obtained results. P = 2 π r ,  S = π r² */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter radius of the flower bed");
        double r = Integer.parseInt(br.readLine());
        double perimeter;
        double area;
        perimeter= 2*Math.PI*r;


        area = Math.PI*r*r;
        System.out.println("Perimetr = " + perimeter);
        System.out.println("Area = " + area);
        /* Define String variables name and address. Output question
         "What is your name?" Read the value name and output next question:
         “Where are you live, (name)?". Read address and write whole information.*/
        System.out.println("Hello. What is your name?");
        String name = br.readLine();
        System.out.println("where do you live, " + name + '?');
        String address = br.readLine();
        System.out.println("Your name is " + name + ", your address is " + address + ".");

        /*Phone calls from three different countries are с1, с2 and с3 standard units per minute.
         Talks continued t1, t2 and t3 minutes. How much computer will count for each call separately
          and all talk together? Input all source data from console, make calculations and output to the screen.
          */
        System.out.println("What is the standard unit for the call c1(USD)?");
        int c1 = Integer.parseInt(br.readLine());
        System.out.println("What is the standard unit for the call c2? (USD)");
        int c2 = Integer.parseInt(br.readLine());
        System.out.println("What is the standard unit for the call c3? (USD)");
        int c3 = Integer.parseInt(br.readLine());
        System.out.println("How long did the t1 talk take? (min)");
        int t1 = Integer.parseInt(br.readLine());
        System.out.println("How long did the t2 talk take? (min)");
        int t2 = Integer.parseInt(br.readLine());
        System.out.println("How long did the t3 talk take? (min)");
        int t3 = Integer.parseInt(br.readLine());
        int b1 = c1*t1;
        int b2 = c2*t2;
        int b3 = c3*t3;
        int sum = b1+b2+b3;
        System.out.println("Bill for the call c1 = " + b1 + "$");
        System.out.println("Bill for the call c2 = " + b2 + "$");
        System.out.println("Bill for the call c3 = " + b3 + "$");
        System.out.println("Total price for calls c1, c2, c3 is = " + sum + "$");
    }

}
