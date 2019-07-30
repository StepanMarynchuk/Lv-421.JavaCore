package com.softserve;

import java.util.Random;

public class RandomValue {

    public static void main(String a[]){

        System.out.println("Random number between 0 and 1: "+Math.random());
        System.out.println("Random number between 0 and 1: "+Math.random());
        System.out.println("Random number between 0 and 2: "+ getRandom(2));
        System.out.println("Random number between 0 and 5: "+ getRandom(5));
    }

    private static int getRandom(int max) {
        return (int) (Math.random()*max);
    }
}
