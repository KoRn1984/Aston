package by.aston.animal.behavior.animalImpl;

import by.aston.animal.behavior.LivesInWater;

public class Whale extends Mammal implements LivesInWater {

    public Whale(String name) {
        super(name);
    }

    @Override
    public void describeHabitat() {
        System.out.println(name + " живет в воде.");
    }

    @Override
    public void eat() {
        System.out.println(name + " питается планктоном.");
    }
}