package by.aston.transport;

import by.aston.transport.behavior.transportImpl.Airplane;
import by.aston.transport.behavior.transportImpl.Boat;
import by.aston.transport.behavior.transportImpl.Helicopter;
import by.aston.transport.behavior.transportImpl.Tanker;
import by.aston.transport.behavior.transportImpl.Taxi;
import by.aston.transport.behavior.transportImpl.Truck;

public class Vehicles {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Самолет", 10);
        Helicopter helicopter = new Helicopter("Вертолет", 4);
        Boat boat = new Boat("Катер");
        Tanker tanker = new Tanker("Танкер");
        Truck truck = new Truck("Грузовик", 6);
        Taxi taxi = new Taxi("Такси", 4);

        airplane.loadCargo();
        airplane.rotatePropeller();
        airplane.fly();
        airplane.move();
        airplane.unloadCargo();
        System.out.println(airplane.getName() + " имеет " + airplane.getNumberOfWheels() + " колес.");
        System.out.println("--------------------------------------");

        helicopter.loadCargo();
        helicopter.rotatePropeller();
        helicopter.move();
        helicopter.unloadCargo();
        System.out.println(helicopter.getName() + " имеет " + helicopter.getNumberOfWheels() + " колеса.");
        System.out.println("--------------------------------------");

        boat.loadCargo();
        boat.rotatePropeller();
        boat.move();
        boat.unloadCargo();
        System.out.println("--------------------------------------");

        tanker.loadCargo();
        tanker.rotatePropeller();
        tanker.move();
        tanker.unloadCargo();
        System.out.println("--------------------------------------");

        truck.loadCargo();
        truck.move();
        truck.unloadCargo();
        System.out.println(truck.getName() + " имеет " + truck.getNumberOfWheels() + " колес.");
        System.out.println("--------------------------------------");

        taxi.move();
        System.out.println(taxi.getName() + " имеет " + taxi.getNumberOfWheels() + " колеса.");
    }
}