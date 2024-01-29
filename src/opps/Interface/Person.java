package opps.Interface;

import java.util.Objects;

public class Person {
    private String name;
    private Vechicle[] vechicles;

    public Person() {
    }

    public Person(String name, Vechicle[] vechicles) {
        this.name = name;
        this.vechicles = vechicles;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vechicle[] getVechicles() {
        return this.vechicles;
    }

    public void setVechicles(Vechicle[] vechicles) {
        this.vechicles = vechicles;
    }

    public Person name(String name) {
        setName(name);
        return this;
    }

    public Person vechicles(Vechicle[] vechicles) {
        setVechicles(vechicles);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(vechicles, person.vechicles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, vechicles);
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", vechicles='" + getVechicles() + "'" +
                "}";
    }

}
