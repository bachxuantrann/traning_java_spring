package oop_inheritance_abstraction.abstract_code;

public class Circle extends Shape{
    public static final double PI=3.14;
    private double radius;

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }
}
