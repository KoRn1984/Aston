package by.aston.transport.behavior.transportImpl;

import by.aston.transport.behavior.Transport;

/**
 * Абстрактный класс для общего поведения транспортных средств.
 */
public abstract class AbstractTransport implements Transport {
    protected String name;

    public AbstractTransport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}