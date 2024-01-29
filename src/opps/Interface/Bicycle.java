package opps.Interface;

public class Bicycle implements Vechicle {
    private int currentSpeed;

    public Bicycle() {
    }

    public Bicycle(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int amount) {

        System.out.println("Paddel");
        this.currentSpeed += amount;

        this.currentSpeed += amount;
    }

    @Override
    public void applyBreaks(int amount) {
        this.currentSpeed -= amount;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

}
