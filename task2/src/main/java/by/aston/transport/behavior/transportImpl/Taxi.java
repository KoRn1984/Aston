package by.aston.transport.behavior.transportImpl;

import by.aston.transport.behavior.HasWheels;

public class Taxi extends AbstractTransport implements HasWheels {
    private final int numberOfWheels;

    public Taxi(String name, int numberOfWheels) {
        super(name);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public void move() {
        System.out.println(name + " перевозит пассажиров.");
    }
}