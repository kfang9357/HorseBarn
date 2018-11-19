package com.company;

public class Mustang implements Horse {

    //fields

    private String name;
    private int weight;

    //constructors

    public Mustang (String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }

    //methods

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @java.lang.Override
    public String toString() {
        return null;
    }
}
