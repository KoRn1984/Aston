package by.aston.transport.behavior.transportImpl;

import by.aston.transport.behavior.HasWheels;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Taxi taxi = (Taxi) o;
        return numberOfWheels == taxi.numberOfWheels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfWheels);
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "numberOfWheels=" + numberOfWheels +
                '}';
    }
}