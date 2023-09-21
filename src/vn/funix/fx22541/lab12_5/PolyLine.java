package vn.funix.fx22541.lab12_5;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    private final List<Point> points;

    public PolyLine() {
        points = new ArrayList<>();
    }

    public PolyLine(List<Point> points) {
        this.points = points;
    }

    public void appendPoint(Point point) {
        points.add(point);
    }

    public void appendPoint(int x, int y) {
        points.add(new Point(x, y));
    }

    public double getLength() {
        double thisLength = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            thisLength += Math.sqrt(
                    Math.pow(points.get(i + 1).getX() - points.get(i).getX(), 2) +
                            Math.pow(points.get(i + 1).getY() - points.get(i).getY(), 2));
        }
        return thisLength;
    }
}
