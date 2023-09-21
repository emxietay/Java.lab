package vn.funix.fx22541.lab11_1;

public class Car {
    private boolean engine;
    private final int cylinders;
    private final String name;
    private int wheels;


    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;


    }

    public String accelerate() {
        return "The car is accelerating...";
    }

    public String brake() {
        return "The car is slowing down...";
    }

    public String startEngine() {
        return "Starting ...";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
