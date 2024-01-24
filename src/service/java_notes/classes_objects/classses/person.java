package service.java_notes.classes_objects.classses;

import java.util.Objects;



public class person {
    private String name;
    private String email;
    private Gander gender;
    private cat_class[] cats;

    public person(String name, String email, Gander gender, cat_class[] cats) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.cats = cats;
    }

    public person(String name, String email, Gander gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gander getGender() {
        return this.gender;
    }

    public void setGender(Gander gender) {
        this.gender = gender;
    }

    public cat_class[] getCats() {
        return this.cats;
    }

    public void setCats(cat_class[] cats) {
        this.cats = cats;
    }

    public person() {
    }

    public person name(String name) {
        setName(name);
        return this;
    }

    public person email(String email) {
        setEmail(email);
        return this;
    }

    public person gender(Gander gender) {
        setGender(gender);
        return this;
    }

    public person cats(cat_class[] cats) {
        setCats(cats);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof person)) {
            return false;
        }
        person person = (person) o;
        return Objects.equals(name, person.name) && Objects.equals(email, person.email)
                && Objects.equals(gender, person.gender) && Objects.equals(cats, person.cats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, gender, cats);
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", email='" + getEmail() + "'" +
                ", gender='" + getGender() + "'" +
                ", cats='" + getCats() + "'" +
                "}";
    }

}
