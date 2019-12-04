package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {


    public static void main(String[] args) {
        Circle circle = new Circle("krug",22);
        circle.draw();
        Square square = new Square("квадрат",4);
        square.calculationPeremetr();

        Figure[] figures={circle, square, new Triangle(" треуголник",4, 3,3),
                new Rectangle("прямоуголник",3,5) };
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].getName() + "  "+ figures[i].drow
                    + "  " +  figures[i].calculationPerimetr());

        Dog dog=new Dog(" dog  ");

            System.out.println(dog.getName()+dog.drow());
       dog.callSound("lalalala");
        }
    }
    }


