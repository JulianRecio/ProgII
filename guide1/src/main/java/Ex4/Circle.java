package Ex4;

import Ex3.Point2D;

public class Circle {

    private Point2D center;
    private double radius;

    public Circle(Point2D center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point2D getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public boolean contains(Point2D point2D) {
        double centerToPoint = center.getDistance(point2D);
        return centerToPoint < radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
