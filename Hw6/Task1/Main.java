package com.softserve;


public class Main {

    public static void main(String[] args) {
        Birds[] bb = new Birds[4];

        bb[0] = new Eagle ("gold and white", "2 or 4");
        bb[1] = new Swallow ("black, red, yellow, silver and blue", "4 or 5");
        bb[2] = new Penguin ("black and white", "1 or 2");
        bb[3] = new Chicken ("yellow  and red", "5 or 10");
        for (int i = 0; i < bb.length; i++) {
            System.out.println (bb[i].fly ());
            System.out.println (bb[i]);

        }

    }
}