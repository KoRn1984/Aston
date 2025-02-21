package by.aston.transport.behavior.transportImpl;

import by.aston.transport.behavior.Transport;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AbstractTransport that = (AbstractTransport) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "AbstractTransport{" +
                "name='" + name + '\'' +
                '}';
    }
}