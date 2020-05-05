package info.my.triangle;

import info.my.AbstractShape;

public class Triangle extends AbstractShape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }


    public void setABC(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double getArea(){
        double pp=(a+b+c)/2;
        double virajenie=pp*(pp-a)*(pp-b)*(pp-c);
        return Math.sqrt(virajenie);
    }
}
