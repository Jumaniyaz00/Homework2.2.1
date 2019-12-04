package com.company;

public class Circle extends Figure implements Drawable{

  private int r;
  private final double  pi= 3.14;

    public Circle(String name, int r) {
        super(name);
        this.r = r;
    }

    @Override
    public String draw() {
        return " ";
    }

    @Override
    public double calculationPerimetr() {
        return pi*r*r;
    }

    @Override
    public String drow() {
        return null;
    }
}
