package service.java_notes.classes_objects.objects;

import service.java_notes.classes_objects.classses.cat_class;

public class object_class {

    public static void main(String[] args) {
        // // pcat is an objectof the class cat_class
        // // with custom construtor
        // cat_class pcat = new cat_class("pussy", 20);
        // pcat.meow();
        // System.out.println(pcat.getName());
        // System.out.println(pcat.getAge());

        // // scat is an object of the class cat_class
        // // with defult constructor
        // cat_class scat = new cat_class();
        // scat.meow();
        // System.out.println(scat.getName());
        // System.out.println(scat.getAge());

        // // dcat is an object of the class cat_class
        // // with multple constructor
        // cat_class dcat = new cat_class("google");
        // dcat.meow();
        // System.out.println(dcat.getName());
        // System.out.println(dcat.getAge());

        cat_class vcat = new cat_class("pussy", 20, "Blue");
        // System.out.println(vcat.getName());
        // System.out.println(vcat.getAge());
        // System.out.println(vcat.getColour());
        System.out.println(vcat.toString());

        System.out.println(vcat);

    }

}
