package com.softserve;

public class FlyingBird extends Birds {
    @Override
    public String fly() {
        return "These birds can fly";
    }

    public FlyingBird(String feathers, String layEggs) {
        super (feathers, layEggs);
    }
}