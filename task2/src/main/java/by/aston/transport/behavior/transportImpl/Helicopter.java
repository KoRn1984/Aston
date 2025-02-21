package by.aston.transport.behavior.transportImpl;

import by.aston.transport.behavior.CarriesCargo;
import by.aston.transport.behavior.HasPropeller;
import by.aston.transport.behavior.HasWheels;

import java.util.Objects;

public class Helicopter extends AbstractTransport implements HasPropeller, HasWheels, CarriesCargo {
    private final int numberOfWheels;

    public Helicopter(String name, int numberOfWheels) {
        super(name);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void rotatePropeller() {
        System.out.println(name + " вращает винт.");
    }

    @Override
    public void move() {
        System.out.println(name + " летит по воздуху.");
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
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Helicopter that = (Helicopter) o;
        return numberOfWheels == that.numberOfWheels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfWheels);
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "numberOfWheels=" + numberOfWheels +
                '}';
    }
}