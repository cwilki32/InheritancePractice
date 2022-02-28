package com.company;

public class AppleDemo {

    public static void main(String[] args) {
        // Create (2) classes named Fruit and Apple, and set up Apple as a subclass of Fruit
        //Give fruit at least (2) proprties with getters and setters
        //Give apple 3 properties with getters and setters
        //Create a constructor for Apple which initializes all properties (including those form fruit) to a default value
        //Create a printdetails() method for Apple
        //Rename main class to appledemo, instantiate an apple object, and call your printDetails() method

        Apple apple = new Apple(7, "Gala", true);
        apple.printDetails();
    }
}
