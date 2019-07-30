package com.softserve;


//Task1
    public class Main {

    public static void main(String[] args) throws Exception {
        Thread t1 = new MyThread ("I like studying Java =)", 100);
        Thread t2 = new MyThread ("Believe in yourself", 100);
        Thread t3 = new MyThread ("Today is a good day! Keep smile =)", 9000);
        t1.start ();
        t2.start ();
        t3.start ();
        // t1.join();
         t3.join();
        System.out.println ("Thread main");
    }
}