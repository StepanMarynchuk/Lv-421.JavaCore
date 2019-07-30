package com.softserve;
import java.util.Scanner;

public class Task3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int[] arr = new int[5];
        int largest = arr[0];
        int secondLargest = arr[0];
        int n;
        int product = 1;
        int iSecondLargest= 0;


        for (int i = 0; i < arr.length; i++) {
            System.out.println ("Input number");
            n = Integer.parseInt (sc.nextLine ());

            if (n > largest) {
                secondLargest = largest;
                largest = n;

            }else if (n > secondLargest) {
                secondLargest = n;
                iSecondLargest = n;

            }
            if (n > 0) {
                product *= n;
            }
        }

        System.out.println ("\nSecond largest number is" + " " + secondLargest + ".");
        System.out.println ("It is in the" + (iSecondLargest + 1) + " place" + ".");
        System.out.println ("Total product is" + " " + product + ".");
    }
}