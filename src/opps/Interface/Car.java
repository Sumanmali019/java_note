package opps.Interface;

public class Car implements Vechicle {
    private int currentSpeed;

    public Car() {
    }

    public Car(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int amount) {
        System.out.println("Start engine");
        System.out.println("accelarte");
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
