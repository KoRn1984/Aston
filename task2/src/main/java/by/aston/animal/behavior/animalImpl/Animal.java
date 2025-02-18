package by.aston.animal.behavior.animalImpl;

/**
 * Общий абстрактный класс для всех животных.
 */
public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
}