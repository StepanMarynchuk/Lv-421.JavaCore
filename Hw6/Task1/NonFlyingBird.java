package com.softserve;

public class NonFlyingBird extends Birds {
    @Override
    public String fly() {
        return "These birds do not fly";
    }

    public NonFlyingBird(String feathers, String layEggs) {
        super (feathers, layEggs);
    }
}
