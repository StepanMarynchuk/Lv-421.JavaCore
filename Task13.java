package com.company;

import java.io.BufferedReader;
import java.io.IOException;

public class Task13 {

    public static void task13() {
        int start = 2520;
        boolean check = false;

        while (true) {
            if (start % 11 == 0 && start % 13 == 0 && start % 17 == 0 && start % 19 == 0) {
                check = true;
            }
            if (check) {
                System.out.println(start);
                break;
            }
            start += 20;
        }
        System.out.println("Number " + start);
    }
}
