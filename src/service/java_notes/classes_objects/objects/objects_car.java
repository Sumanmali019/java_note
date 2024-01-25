package service.java_notes.classes_objects.objects;

import service.java_notes.classes_objects.exersise.CarDelership;
import service.java_notes.classes_objects.exersise.Cars;
import service.java_notes.classes_objects.exersise.Cars.EnginrType;

public class objects_car {

    public static void main(String[] args) {

        CarDelership carDelership = new CarDelership("xyz", 5);

        carDelership.addNewCar(new Cars("Honda", 2500, Cars.EnginrType.PETROL));
        carDelership.addNewCar(new Cars("Tata", 3500, Cars.EnginrType.DESSILE));
        carDelership.addNewCar(new Cars("OLA", 4500, Cars.EnginrType.ELECTONIC));

        System.out.println("current stock" + carDelership.getName());
        Cars[] carsInStock = carDelership.getCarInStock();
        for (Cars cars : carsInStock) {
            if (cars != null) {
                System.out.println(cars.getManufacturer() + "**** " + cars.getEnginrType());
            }
        }

        // Cars car1 = new Cars("Honda", 50000.0, EnginrType.PETROL);
        // System.out.println(car1);

        // car1.setManufacturer("EV");
        // car1.setPrice(300000);
        // car1.setEnginrType(EnginrType.ELECTONIC);

        // System.out.println("Engine type :" + car1.getEnginrType());
        // System.out.println("Manufacturing :" + car1.getManufacturer());
        // System.out.println("price :" + car1.getPrice());

    }
}
