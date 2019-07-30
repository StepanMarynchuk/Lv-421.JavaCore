package com.softserve;

public abstract class Birds {
    public String feathers;
    public String layEggs;

    public Birds(String feathers, String layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
/*
    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public String layEggs;

    public void setLayEggs(String layEggs) {
        this.layEggs = layEggs;
    }
    */
    public abstract String fly ();
}
