package service.java_notes.classes_objects.classses;

import java.util.Objects;

public class cat_class {
    // property
    private String name;
    private int age;
    private String colour;



    public cat_class(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
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

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", colour='" + getColour() + "'" +
            "}";
    }


    public cat_class() {
    }

    public cat_class name(String name) {
        setName(name);
        return this;
    }

    public cat_class age(int age) {
        setAge(age);
        return this;
    }

    public cat_class colour(String colour) {
        setColour(colour);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof cat_class)) {
            return false;
        }
        cat_class cat_class = (cat_class) o;
        return Objects.equals(name, cat_class.name) && age == cat_class.age && Objects.equals(colour, cat_class.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, colour);
    }
    


    // // construstor
    // public cat_class(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    // }

    // // defult construtor
    // public cat_class() {
    // }

    // // multiple constructor
    // public cat_class(String name) {
    //     this.name = name;
    //     this.age = 0;
    // }

    // public cat_class(String name, int age, String colour) {
    //     this(name, age);
    //     this.colour = colour;
    // }

    // // behaviour
    // public void meow() {
    //     System.out.println(name + " " + ": mewo....");
    // }

    // // set the property -- setter methiod
    // public void setName(String name) {
    //     this.name = name;
    // }

    // public void setAge(int age) {
    //     this.age = age;
    // }

    // public void setColor(String colour) {
    //     this.colour = colour;
    // }

    // // get the property -- getter methiod
    // public String getName() {
    //     return name;
    // }

    // public int getAge() {
    //     return age;
    // }

    // public String getColour() {
    //     return colour;
    // }

    // // string represtion of the object
    // @Override
    // public String toString() {
    //     return "name:" + name + " " + "colour:" + colour + " " + "age:" + age;
    // }

    // @Override
    // public boolean equals(Object o) {

    //     if (this == o)
    //         return true;
    //     if (o == null || getClass() != o.getClass())
    //         return false;

    //     cat_class cat = (cat_class) o;

    //     return age == cat.age &&
    //             Objects.equals(name, cat.name) &&
    //             Objects.equals(colour, cat.colour);
    // }

    // @Override
    // public int hashCode() {
    //     return Objects.hash(name, age, colour);

    // }

    /*
     * 1 * When we have a property we should always
     * have a getter and setter for that property
     * 
     * 2 * Constructor allows us to pass values at the point of inisilization of
     * object
     * 
     * 3 * If you don't specify the default construction java gives by default
     * 
     */
}
