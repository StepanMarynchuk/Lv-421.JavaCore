package com.softserve;

public class Eagle extends FlyingBird{
    @Override
    public String toString() {
        return "Eagle{" +
                "feathers='" + feathers + '\'' +
                ", layEggs='" + layEggs + '\'' +
                '}';
    }

    @Override
    public String fly() {
        return super.fly ();
    }

    public Eagle(String feathers, String layEggs) {
        super (feathers, layEggs);
    }


}
