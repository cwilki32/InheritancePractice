package com.company;

public class Fruit {
    private String color;
    private boolean fromTree;

    public Fruit(String color, boolean fromTree) {
        this.color = color;
        this.fromTree = fromTree;
    }
    public String getColor() {
        return color;
    }

    public boolean isFromTree() {
        return fromTree;
    }
}
