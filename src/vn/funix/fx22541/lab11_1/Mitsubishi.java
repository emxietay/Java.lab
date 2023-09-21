package vn.funix.fx22541.lab11_1;

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return super.accelerate() + " by Mitsubishi";

    }

    @Override
    public String brake() {
        return super.brake() + " by Mitsubishi";
    }

    @Override
    public String startEngine() {
        return super.startEngine() + " by Mitsubishi";
    }
}
