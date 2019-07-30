package com.company;

import java.io.BufferedReader;
import java.io.IOException;

public class Task10 {
    public static void task10(BufferedReader br) throws IOException {
        System.out.println("input number ");
        int number = Integer.parseInt(br.readLine());
        if(number<0)
            System.out.println("negative number ");
        int count =0;
        while (number!=1) {
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number = number * 3 + 1;
            }
            count++;
        }
        System.out.println("count "+count);
    }
}
