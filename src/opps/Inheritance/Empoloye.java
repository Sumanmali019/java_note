package opps.Inheritance;

import service.java_notes.basic_notes.string;
import java.util.Objects;

/*
 * Protected means the only thing has access to the data is the 
 class and the supclass of that class
 * 
 * 
 */

public class Empoloye {

    protected String name;
    protected int age;
    protected String address;

    public Empoloye() {
    }

    public Empoloye(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Empoloye name(String name) {
        setName(name);
        return this;
    }

    public Empoloye age(int age) {
        setAge(age);
        return this;
    }

    public Empoloye address(String address) {
        setAddress(address);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Empoloye)) {
            return false;
        }
        Empoloye empoloye = (Empoloye) o;
        return Objects.equals(name, empoloye.name) && age == empoloye.age && Objects.equals(address, empoloye.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                " name='" + getName() + "'" +
                ", age='" + getAge() + "'" +
                ", address='" + getAddress() + "'" +
                "}";
    }

    public void sayHi() {
        System.out.println("HI" + " " + this.name);
    }

}
