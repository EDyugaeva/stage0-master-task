package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String fur = new String();
        if (this.hasFur) {
            fur = "a";

        }
        else {
            fur = "no";
        }

        String paw = " paw";
        if (this.numberOfPaws > 1) {
            paw = " paws";
        }

        String string = "This animal is mostly " + this.color +
                ". It has " + this.numberOfPaws + paw +
               " and " + fur +
                " fur.";
           return string;

    }
}
