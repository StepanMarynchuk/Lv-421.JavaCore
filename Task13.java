package com.company;

import java.io.BufferedReader;
import java.io.IOException;

public class Task13 {

    public static void task13()  {
        int start = 20;
        boolean check = true;

        while (true) {
            for (int i = 1; i <= 20; i++) {
                if (start % i != 0) {
                    check = false;
                    break;
                }
            }
            start+=20;
            if (check) {
                System.out.println(start);
                break;
            }
        }
        System.out.println("Number " + start);
    }
}
