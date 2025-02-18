package by.aston.transport.behavior.transportImpl;

import by.aston.transport.behavior.CarriesCargo;
import by.aston.transport.behavior.HasPropeller;
import by.aston.transport.behavior.HasWheels;
import by.aston.transport.behavior.HasWings;

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
}