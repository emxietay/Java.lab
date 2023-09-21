package vn.funix.fx22541.lab11_1;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return super.accelerate() + " by a Ford car.";
    }

    @Override
    public String brake() {
        return super.brake() + " by a Ford car.";
    }

    @Override
    public String startEngine() {
        return super.startEngine() + " by a Ford car.";
    }
}
