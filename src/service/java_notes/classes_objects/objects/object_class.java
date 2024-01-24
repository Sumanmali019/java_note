package service.java_notes.classes_objects.objects;

import service.java_notes.classes_objects.classses.cat_class;

public class object_class {

    public static void main(String[] args) {
        // pcat is an objectof the class cat_class
        // with custom construtor
        cat_class pcat = new cat_class("name", 20, "black");
        System.out.println(pcat.getName());
        System.out.println(pcat.getAge());
        System.out.println(pcat.getColour());
        System.out.println(pcat.toString());
        // scat is an object of the class cat_class
        // with defult constructor
        // cat_class scat = new cat_class();

        // System.out.println(scat.getName());
        // System.out.println(scat.getAge());

        // dcat is an object of the class cat_class
        // with multple constructor
        cat_class dcat = new cat_class("pussy", 20, "Blue");

        System.out.println(dcat.getName());
        System.out.println(dcat.getAge());

        cat_class vcat = new cat_class("pussy", 20, "Blue");
        System.out.println(vcat.getName());
        System.out.println(vcat.getAge());
        System.out.println(vcat.getColour());
        System.out.println(vcat.toString());

        System.out.println(vcat);

        System.out.println(vcat == dcat);
        System.out.println(vcat.equals(dcat));

    }

}

/*
 * 
 * 
 * - In java everything is an objects.
 * 
 * - The objects class is the parents of all objects.
 * 
 * - Meaning cat_class above is an object
 * 
 * 
 * 
 */
