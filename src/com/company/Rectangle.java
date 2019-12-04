package com.company;

public class Rectangle extends  Figure implements Drawable
{
    private double sideA;
    private double sideB;
    private double sideC;

    public Rectangle(String name, double sideA, double sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;

    }

    @Override
    public String draw() {
        return " ";
    }

    @Override
    public double calculationPerimetr() {
        return sideA+sideB;
    }

    @Override
    public String drow() {
        return null;
    }
}
