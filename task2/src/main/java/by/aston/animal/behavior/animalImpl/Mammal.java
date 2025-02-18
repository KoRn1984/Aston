package by.aston.animal.behavior.animalImpl;

import by.aston.animal.behavior.HasBackbone;

public abstract class Mammal extends Animal implements HasBackbone {

    public Mammal(String name) {
        super(name);
    }

    @Override
    public void describeBackbone() {
        System.out.println(name + " имеет позвоночник.");
    }
}