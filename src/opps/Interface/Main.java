package opps.Interface;

/*
 * Polymorphrism = has many form4
 * we can only create constans 
 * we can only contain abstrac methods
 * we can only contain defult methods 
 */
public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        ElectricScooter electricScooter = new ElectricScooter();

        Vechicle[] vechicles = { car, bicycle, electricScooter };

        Person person = new Person("suman", vechicles);

        for (Vechicle vechicl : person.getVechicles()) {
            vechicl.move(10);
            // System.out.println(vechicl.getCurrentSpeed());
            System.out.println();
        }
    }

}
