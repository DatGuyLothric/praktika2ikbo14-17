package com.pract_3;

public class Circle extends Shape {

    protected double radius;

    public Circle() {
        this.radius = 10.0;
        this.color = "000000";
        this.filled = false;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "000000";
        this.filled = false;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14*this.radius*this.radius;
    }

    public double getPerimeter() {
        return 2*3.14*this.radius;
    }

    public String toString() {
        return "radius: " + this.radius + ", color: " + this.color + ", filled: " + this.filled;
    }

}
