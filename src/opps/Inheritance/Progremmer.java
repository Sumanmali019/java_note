package opps.Inheritance;

import java.util.Objects;
import service.java_notes.basic_notes.string;

public class Progremmer extends Empoloye {

    private String[] languag;

    public Progremmer(
            String name,
            int age,
            String address) {

        super(name, age, address);
    }

    public Progremmer(String name, int age, String address, String[] languag) {

        super(name, age, address);
        this.languag = languag;
    }

    // public void sayHi() {
    // System.out.println("hello");
    // }

    public void WriteCode() {
        super.sayHi();
        // super.sayHi();
        // System.out.println("java");

        System.out.println(this.name + ":write code");
    }

    @Override
    public void sayHi() {
        this.sayHi();
    }

}