package oop_inheritance_abstraction.abstract_code;

public class Retangle extends Shape{
    private double length;
    private double width;

    public Retangle() {
    }
    public Retangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double getArea() {
        return length*width;
    }
}
