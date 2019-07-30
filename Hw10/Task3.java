
package com.softserve;
public class Task3 {


    public static void main(String s[]) {
        Thread t1 = new Thread () {
            public void run() {
                Thread t2 = new Thread () {
                    public void run() {
                        for (int i = 0; i < 3; i++) {
                            System.out.println ("Thread number two");
                        }
                        Thread t3 = new Thread () {
                            public void run() {
                                for (int i = 0; i < 5; i++) {
                                    System.out.println ("Thread number three");
                                }

                            }
                        };
                        t3.start ();

                    }

                };
                t2.start ();
            }
        };
        t1.start ();
    }
}
