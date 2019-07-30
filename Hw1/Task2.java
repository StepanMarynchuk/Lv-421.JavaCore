package com.softserve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("What is your name?");
        String name = br.readLine();
        System.out.println ("“Where are you live" + "," + " " + name + "?");
        String address = br.readLine();
        System.out.println("Thank you. So, your name is" + ' ' + name + ' ' + "and" + ' ' + "you live" + " " + address + '.' + ' ' +  "Nice to meet you!");
    }
}