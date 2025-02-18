package by.aston.transport.behavior.transportImpl;

import by.aston.transport.behavior.CarriesCargo;
import by.aston.transport.behavior.HasPropeller;

public class Boat extends AbstractTransport implements HasPropeller, CarriesCargo {

    public Boat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " плывет по воде.");
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
    public void rotatePropeller() {
        System.out.println(name + " вращает винт.");
    }
}