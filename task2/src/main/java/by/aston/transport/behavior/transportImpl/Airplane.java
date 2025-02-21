package by.aston.transport.behavior.transportImpl;

import by.aston.transport.behavior.CarriesCargo;
import by.aston.transport.behavior.HasPropeller;
import by.aston.transport.behavior.HasWheels;
import by.aston.transport.behavior.HasWings;

import java.util.Objects;

public class Airplane extends AbstractTransport implements HasWings, HasPropeller, HasWheels, CarriesCargo {
    private final int numberOfWheels;

    public Airplane(String name, int numberOfWheels) {
        super(name);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void fly() {
        System.out.println(name + " использует крылья для полета.");
    }

    @Override
    public void move() {
        System.out.println(name + " летит по воздуху.");
    }

    @Override
    public void rotatePropeller() {
        System.out.println(name + " вращает винт.");
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public void loadCargo() {
        System.out.println(name + " загружает груз.");
    }

    @Override
    public void unloadCargo() {
        System.out.println(name + " разгружает груз.");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Airplane airplane = (Airplane) o;
        return numberOfWheels == airplane.numberOfWheels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfWheels);
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "numberOfWheels=" + numberOfWheels +
                '}';
    }
}