package vn.funix.fx22541.lab11_6;

public class Circle implements IShape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * 3.14;
    }

    @Override
    public double getPerimeter() {
        return 3.14 * 2 * radius;
    }
}