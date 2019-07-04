/*
This code doesn't work properly, but any error in console. Every time i get "Invalid input" instead of continent. Please advise
what was lost
*/


package com.softserve;

import com.softserve.Continent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Enter the name of the country.");
        String input = br.readLine ();
        switch (input.toLowerCase() ) {
            case "Angola": case"Botswana":
                System.out.println (Continent.Africa);
                break;
            case "Vietnam": case "Thailand":
                System.out.println (Continent.Asia);
                break;
            case "Norway": case "Sweden":
                System.out.println (Continent.Europe);
            case "Cuba": case "United States":
                System.out.println (Continent.NorthAmerica);
                break;
            default:
                System.out.println("Invalid input");
                System.exit(0);



        }
    }
}
