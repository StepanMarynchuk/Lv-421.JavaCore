package com.softserve;
public class Task2 {
    public final static Object first = new Object ();
    public final static Object second = new Object ();

    public static void main(String s[]) {
        Thread t1 = new Thread () {
            public void run() {
                synchronized (first) {
                    Thread.yield ();
                    synchronized (second) {
                        System.out.println ("Who all need it - WHO!");
                    }
                }
            }
        };


        Thread t2 = new Thread () {
            public void run() {
                synchronized (second) {
                    Thread.yield ();
                    synchronized (first) {
                        System.out.println ("Who all need it - YOU!");
                    }
                }
            }
        };
        t1.start ();
        t2.start ();
    }
        }