package com.softserve;

import java.util.Scanner; // імпорт сканера


public class Task3{
    static Scanner scanner = new Scanner (System.in);


    public static void main(String[] args) {

            int c1 = 2; // phone call from DE costs 2 euro cent per minute
            int c2 = 5; // phone call from UK costs 5 euro cent per minute
            int c3 = 3; // phone call from FR costs 3 euro cent per minute

        // t1, t2, t3 - call duration
            int t1 = 0; // the duration of the call from DE
            int t2 = 0; // the duration of the call from UK
            int t3 = 0; // the duration of the call from FR

            System.out.println ("Enter the duration of the call from DE");
            Scanner sc = new Scanner (System.in);
            t1 = scanner.nextInt ();
            System.out.println ("Price of outgoing call from De is:");
            System.out.println (t1 * c1);

            System.out.println ("Enter the duration of the call from UK");
            t2 = scanner.nextInt ();
            System.out.println ("Price of outgoing call from UK is:");
            System.out.println (t2 * c2);

            System.out.println ("Enter the duration of the call from FR");
            t3 = scanner.nextInt ();
            System.out.println ("Price of outgoing call from FR is:");
            System.out.println (t3 * c3);
            System.out.println ("Total price is:");
            System.out.println  ((t1*c1) + (t2*c2) + (t3*c3));

        }
    }