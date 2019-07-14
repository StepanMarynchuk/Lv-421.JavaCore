package com.softserve;

public class Penguin extends NonFlyingBird {
    @Override
    public String toString() {
        return "Penguin{" +
                "feathers='" + feathers + '\'' +
                ", layEggs='" + layEggs + '\'' +
                '}';
    }

    @Override
    public String fly() {
        return super.fly ();
    }

    public Penguin(String feathers, String layEggs) {
        super (feathers, layEggs);
    }


}