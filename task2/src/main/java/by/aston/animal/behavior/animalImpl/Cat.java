package by.aston.animal.behavior.animalImpl;

import by.aston.animal.behavior.HasFur;

public class Cat extends Mammal implements HasFur {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void describeFur() {
        System.out.println(name + " имеет мягкую шерсть.");
    }

    @Override
    public void eat() {
        System.out.println(name + " питается мясом и молочными продуктами.");
    }
}