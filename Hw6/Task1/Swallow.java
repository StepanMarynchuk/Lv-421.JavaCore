package com.softserve;

public class Swallow extends FlyingBird {
    @Override
    public String toString() {
        return "Swallow{" +
                "feathers='" + feathers + '\'' +
                ", layEggs='" + layEggs + '\'' +
                '}';
    }

    @Override
    public String fly() {
        return super.fly ();
    }

    public Swallow(String feathers, String layEggs) {
        super (feathers, layEggs);
    }


}