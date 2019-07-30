package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void fibonacci(BufferedReader br) throws IOException {
        System.out.println("input number for fibonacci ");
        int count = Integer.parseInt(br.readLine());
        int n1 = 0, n2 = 1, n3;
        while(count!=0)
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            count--;
        }
    }
}

