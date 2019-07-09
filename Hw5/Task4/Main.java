package com.softserve;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {



        Car[] c = new Car[4];
        c[0] = new Car ("Renault Megane", 2018, 205);
        c[1] = new Car ("Mazda 6", 2016, 170);
        c[2] = new Car ("Volkswagen golf", 2019, 190);
        c[3] = new Car ("Opel Astra", 2015, 187);



        Car n;
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i].getYearOfProduction () < c[j].getYearOfProduction ()) {
                    n = c[i];
                    c[i] = c[j];
                    c[j] = n;
                }

            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println (c[i]);
        }

        Car y;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println ("Input year of production:");
        int yearOfProduction = Integer.parseInt(br.readLine());

        for (int i = 0; i < c.length; i++) {

            if (c[i].getYearOfProduction () == (yearOfProduction)) {
                System.out.println (c[i]);
            }
        }

    }


}