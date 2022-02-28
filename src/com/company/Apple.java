package com.company;

public class Apple extends Fruit {
    private int numberOfSeeds;
    private String type;
    private boolean keepsDoctorAway;

    public Apple(int numberOfSeeds, String type, boolean keepsDoctorAway) {
        super("red", true);
        this.numberOfSeeds = numberOfSeeds;
        this.type = type;
        this.keepsDoctorAway = keepsDoctorAway;
    }

    public int getNumberOfSeeds() {
        return numberOfSeeds;
    }

    public String getType() {
        return type;

    }

    public boolean isKeepsDoctorAway() {
        return keepsDoctorAway;
    }

    public void printDetails() {
        System.out.println("The color of this apple is " + getColor() + " Is from a tree? " + isFromTree() +
                ". Type: " + getType() + ". Has " + getNumberOfSeeds() + " seeds. " + "Does it keep Doctor away? " +
                isKeepsDoctorAway());
    }
}
