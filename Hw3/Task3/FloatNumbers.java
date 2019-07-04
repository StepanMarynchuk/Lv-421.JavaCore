package com.softserve;



import java.io.IOException;
import java.util.Scanner;

public class FloatNumbers{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Enter any number");
        float n = sc.nextFloat ();

        if (n >= -5.0F && n <= 5.0F) {
            System.out.println (true);
        }else {
            System.out.println (false);
        }
        float p = sc.nextFloat ();
        if (p >= -5.0F && p <= 5.0F) {
            System.out.println (true);
        }else {
            System.out.println (false);
        }
        float t = sc.nextFloat ();
        if (t >= -5.0F && t <= 5.0F) {
            System.out.println (true);
        }else {
            System.out.println (false);
        }

    }
}
