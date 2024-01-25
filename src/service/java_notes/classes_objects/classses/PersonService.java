package service.java_notes.classes_objects.classses;

public class PersonService {

    public int addPerson(person person) {

        if (person.getName().isBlank()) {
            throw new IllegalArgumentException(
                    "Name must not be blank"
            );
        }

        //store to db
        return 1;
    }

}
