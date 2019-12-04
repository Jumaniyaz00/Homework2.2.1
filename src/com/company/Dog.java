package com.company;

public final class Dog extends Animal implements SoundProducable {
    public Dog(String name){
        super(name);
    }



    @Override
    public String drow() {
        return "   ";
    }

    @Override
    public void callSound(String voice) {
        System.out.println(" lalaaaa");
    }
}
