package by.aston.animal.behavior.animalImpl;

import by.aston.animal.behavior.HasBackbone;
import by.aston.animal.behavior.LivesInWater;

public class Fish extends Animal implements HasBackbone, LivesInWater {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void describeBackbone() {
        System.out.println(name + " живет в воде.");
    }

    @Override
    public void describeHabitat() {
        System.out.println(name + " имеет позвоночник.");
    }

    @Override
    public void eat() {
        System.out.println(name + " питается водными организмами.");
    }
}