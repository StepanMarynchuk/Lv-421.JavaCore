package com.softserve;

import java.util.Scanner;


public class Task2 {


    public static void main(String[] args) {
        int [ ] numbers = {3, -5, -2, 6, 6, 4, 2, 1, 3, 4};
        int sum = 0;
        int prod = 1;
       for (int i=0; i < numbers.length-5; i++) {

            if (numbers [i] < 0){
               continue;
}
            sum += numbers[i];
        }
        System.out.println("Total sum of first 5 elements is" + " " + sum);

       for (int j = numbers.length-1; j>=numbers.length-5; j--){

           if (numbers[j] > 0){
        prod *= numbers[j];
    }

}

System.out.println ("Total product of last 5 elements is" + " " + prod);
    }
}