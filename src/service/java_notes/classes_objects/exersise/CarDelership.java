package service.java_notes.classes_objects.exersise;

import java.util.Objects;

public class CarDelership {

    private String name;
    private int maxCarsDisplay;
    private Cars[] carInStock;

    public CarDelership() {
    }

    public CarDelership(String name, int maxCarsDisplay) {
        this.name = name;
        this.maxCarsDisplay = maxCarsDisplay;
        this.carInStock = new Cars[maxCarsDisplay];
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCarsDisplay() {
        return this.maxCarsDisplay;
    }

    public void setMaxCarsDisplay(int maxCarsDisplay) {
        this.maxCarsDisplay = maxCarsDisplay;
    }

    public Cars[] getCarInStock() {
        return this.carInStock;
    }

    public void setCarInStock(Cars[] carInStock) {
        this.carInStock = carInStock;
    }

    public CarDelership name(String name) {
        setName(name);
        return this;
    }

    public CarDelership maxCarsDisplay(int maxCarsDisplay) {
        setMaxCarsDisplay(maxCarsDisplay);
        return this;
    }

    public CarDelership carInStock(Cars[] carInStock) {
        setCarInStock(carInStock);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CarDelership)) {
            return false;
        }
        CarDelership carDelership = (CarDelership) o;
        return Objects.equals(name, carDelership.name) && maxCarsDisplay == carDelership.maxCarsDisplay
                && Objects.equals(carInStock, carDelership.carInStock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxCarsDisplay, carInStock);
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", maxCarsDisplay='" + getMaxCarsDisplay() + "'" +
                ", carInStock='" + getCarInStock() + "'" +
                "}";
    }

    public void addNewCar(Cars cars) {
        int currentStocksize = getCarInStockCount();
        if (currentStocksize < maxCarsDisplay) {
            carInStock[currentStocksize] = cars;
            System.out.println(cars.getManufacturer() + " " + cars.getEnginrType());
        } else {
            System.out.println(" Max capacity ");
        }

    }

    public int getCarInStockCount() {
        int count = 0;
        for (Cars car : carInStock) {
            if (car != null) {
                count++;
            }
        }

        return count;
    }
}
