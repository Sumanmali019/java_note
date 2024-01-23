package service.java_notes.classes_objects.classses;

public class cat_class {
    // property
    private String name;
    private int age;
    private String colour;

    // construstor
    public cat_class(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    // defult construtor
    public cat_class() {
    }

    // multiple constructor
    public cat_class(String name) {
        this.name = name;
        this.age = 0;
    }

    // behaviour
    public void meow() {
        System.out.println(name + " " + ": mewo....");
    }

    // set the property -- setter methiod
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String colour) {
        this.colour = colour;
    }

    // get the property -- getter methiod
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColour() {
        return colour;
    }

    // string represtion of the object
    public String toString() {
        return "name:" + name + " " + "colour:" + colour + " " + "age:" + age;
    }

    /*
     * 1 * When we have a property we should always
     * have a getter and setter for thet property
     * 
     * 2 * Constructor allows us to pass values at the point of inisilization of
     * object
     * 
     * 3 * If you don't seapify the default construction java gives by default
     * 
     */
}
