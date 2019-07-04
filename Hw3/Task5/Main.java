package com.softserve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Enter number of HTTPError");
        int input = Integer.parseInt (br.readLine ());
        switch (input) {
            case 400:
                System.out.println (HTTPError.BadRequest);
                break;
            case 401:
                System.out.println (HTTPError.Unauthorized);
                break;
            case 402:
                System.out.println (HTTPError.PaymentRequired);
                break;
            default:
                System.out.println("Check input");
                System.exit(0);



        }
    }
}