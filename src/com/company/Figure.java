package com.company;

public abstract class Figure implements Drawable{
    public  String name;
    public String drow;

    public String getDrow() {
        return drow;
    }

    public Figure() {

    }


    public String getName() {
        return name;
    }

    public  abstract String draw();

    public abstract  double calculationPerimetr();

    public Figure(String name) {
        this.name = name;
    }


    }



