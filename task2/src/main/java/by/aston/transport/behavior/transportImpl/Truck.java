package by.aston.transport.behavior.transportImpl;

import by.aston.transport.behavior.CarriesCargo;
import by.aston.transport.behavior.HasWheels;

public class Truck extends AbstractTransport implements HasWheels, CarriesCargo {
    private final int numberOfWheels;

    public Truck(String name, int numberOfWheels) {
        super(name);
        this.numberOfWheels = numberOfWheels;
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
    public void move() {
        System.out.println(name + " едет по дороге.");
    }
}