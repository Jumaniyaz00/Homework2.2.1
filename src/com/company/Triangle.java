package com.company;

public class Triangle extends Figure implements Drawable {
    private  int sideA;
    private  int sideB;
    private  int sideC;

    public Triangle(String name, int sideA, int sideB, int sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String draw() {
    return "";
    }

    @Override
    public double calculationPerimetr() {
        return sideA+ sideB+ sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    @Override
    public String drow() {
        return null;
    }
}
