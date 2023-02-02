package com.techelevator;

public abstract class Wall {
    private String name;
    private String color;

    public Wall(String name, String color) {

    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public abstract int getArea();

}
