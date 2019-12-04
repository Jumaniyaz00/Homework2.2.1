package com.company;

public class Square extends Figure implements Drawable{
    private  int sideA;
         String  name;

    public Square(String name, int sideA, String name1) {
        super(name);
        this.sideA = sideA;
        this.name = name1;
    }

    public int getSideA() {
        return sideA;
    }

    public Square(String квадрат, int i) {
        super();
    }

    public  int calculationPeremetr(){
        return 4* sideA;
    }


    @Override
    public String draw() {
        return "";
    }

    @Override
    public double calculationPerimetr() {
        return sideA*sideA;
    }

    @Override
    public String drow() {
        return null;
    }
}
