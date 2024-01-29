package opps.Abstracts;

public class Main {

    /*
     * Abstracts keywords comes before the class
     * 
     * Abstracts classes can't be instantiated
     * 
     * Abstracts keywords comes before methods
     * -have no method body
     * -Need to be inside absacract classes or interface
     * 
     *
     * 
     */
    public static void main(String[] arg) {

        // Animal cat = new Cat("suman");
        // Animal dog = new Dog("fdog");

        // dog.makeSound();
        // cat.makeSound();
        
        // System.out.println(cat.getName());
        // System.out.println(dog.getName());
        new NumberExtarctReport().prepareAndSendReport("src/data.txt");
      
    }

}
