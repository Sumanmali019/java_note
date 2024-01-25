package service.java_notes.classes_objects.exersise;

import java.util.Objects;

public class Cars {

    public enum EnginrType {
        PETROL,
        ELECTONIC,
        DESSILE,
    }

    private String manufacturer;
    private double price;
    private EnginrType enginrType;

    public Cars(String manufacturer, double price, EnginrType enginrType) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.enginrType = enginrType;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public EnginrType getEnginrType() {
        return this.enginrType;
    }

    @Override
    public String toString() {
        return "{" +
                " manufacturer='" + getManufacturer() + "'" +
                ", price='" + getPrice() + "'" +
                ", enginrType='" + getEnginrType() + "'" +
                "}";
    }

    public void setEnginrType(EnginrType enginrType) {
        this.enginrType = enginrType;
    }

    public Cars() {
    }

    public Cars manufacturer(String manufacturer) {
        setManufacturer(manufacturer);
        return this;
    }

    public Cars price(double price) {
        setPrice(price);
        return this;
    }

    public Cars enginrType(EnginrType enginrType) {
        setEnginrType(enginrType);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cars)) {
            return false;
        }
        Cars cars = (Cars) o;
        return Objects.equals(manufacturer, cars.manufacturer) && price == cars.price
                && Objects.equals(enginrType, cars.enginrType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, enginrType);
    }

}
