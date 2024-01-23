package service.java_notes.basic_notes;

/*
 * Emuns have a datatype 
 * 
 * 
 */
enum Gander {
    MALE,
    FEMALE,
}

enum Tshritsize {
    L,
    M,
    S,
    XL
}

public class emuns {
    public static final String MALE = "MALE";

    public static void main(String[] args) {
        System.out.println(Gander.valueOf(MALE));

        System.out.println(Gander.values());

        System.out.println(Tshritsize.S);
    }

}
