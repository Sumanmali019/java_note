package opps.Interface;

public class ElectricScooter implements Vechicle {
    private int currentSpeed;

    public ElectricScooter() {
    }

    public ElectricScooter(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int amount) {
        System.out.println("Start scooter");
        this.currentSpeed += amount;

    }

    @Override
    public void applyBreaks(int amount) {

    }

    @Override
    public int getCurrentSpeed() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCurrentSpeed'");
    }

}
