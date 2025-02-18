package by.aston.animal;

import by.aston.animal.behavior.animalImpl.Bear;
import by.aston.animal.behavior.animalImpl.Cat;
import by.aston.animal.behavior.animalImpl.Fish;
import by.aston.animal.behavior.animalImpl.Whale;

public class Animals {
    public static void main(String[] args) {
        Cat cat = new Cat("Кошка");
        Bear bear = new Bear("Медведь");
        Whale whale = new Whale("Кит");
        Fish fish = new Fish("Рыба");

        cat.eat();
        cat.describeBackbone();
        cat.describeFur();
        System.out.println("------------------------------------");

        bear.eat();
        bear.describeBackbone();
        bear.describeFur();
        System.out.println("------------------------------------");

        whale.eat();
        whale.describeBackbone();
        whale.describeHabitat();
        System.out.println("------------------------------------");

        fish.eat();
        fish.describeBackbone();
        fish.describeHabitat();
    }
}