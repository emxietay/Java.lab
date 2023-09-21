package vn.funix.fx22541.lab11_1;

public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return super.accelerate() + " by Holden car.";
    }

    @Override
    public String brake() {
        return super.brake() + " by Holden car.";
    }

    @Override
    public String startEngine() {
        return super.startEngine() + " by Holden car.";
    }
}
