package opps.Abstracts;

import java.util.Objects;

abstract public class Animal {
    private String name;

    public abstract void makeSound();

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal name(String name) {
        setName(name);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Animal)) {
            return false;
        }
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                "}";
    }

}
