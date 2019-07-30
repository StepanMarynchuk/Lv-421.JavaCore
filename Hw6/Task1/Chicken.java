package com.softserve;

public class Chicken extends NonFlyingBird {
    @Override
    public String toString() {
        return "Chicken{" +
                "feathers='" + feathers + '\'' +
                ", layEggs='" + layEggs + '\'' +
                '}';
    }

    public Chicken(String feathers, String layEggs) {
        super (feathers, layEggs);
    }

    @Override
    public String fly() {
        return super.fly ();
    }


}