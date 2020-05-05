package info.my.circle;

import info.my.AbstractShape;

public class Circle extends AbstractShape {
    private double r;
    private final double pi = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return pi*r*r;
    }
}

