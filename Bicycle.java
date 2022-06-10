package toys;

public class Bicycle implements Toy {

    private double maxSpeed;
    private int wheels;

    protected Bicycle(double maxSpeed, int wheels) {
        this.maxSpeed = maxSpeed;
        this.wheels = wheels;
    }

    @Override
    public String getName() {
        return "Bicycle";
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
