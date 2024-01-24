package service.java_notes.classes_objects.objects;

import service.java_notes.classes_objects.classses.Gander;
import service.java_notes.classes_objects.classses.cat_class;
import service.java_notes.classes_objects.classses.person;

public class person_object {
    public static void main(String[] args) {

        cat_class pcat = new cat_class("name", 20, "black");
        cat_class dcat = new cat_class("name2", 10, "blue");

        cat_class[] cats = { pcat, dcat };

        person newp = new person("alex", "mali", Gander.MALE, cats);

        System.out.println(newp);
    }
}
