package by.aston.animal.behavior.animalImpl;

import by.aston.animal.behavior.HasFur;

public class Bear extends Mammal implements HasFur {

    public Bear(String name) {
        super(name);
    }

    @Override
    public void describeFur() {
        System.out.println(name + " имеет густую шерсть.");
    }

    @Override
    public void eat() {
        System.out.println(name + " питается как растительной, так и животной пищей.");
    }
}