package com.pract_3;

public class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle() {
        this.width = 10.0;
        this.length = 5.0;
        this.color = "000000";
        this.filled = false;
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.length = height;
        this.color = "000000";
        this.filled = false;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.length = height;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength() {
        this.length = length;
    }

    public double getArea() {
        return this.length*this.width;
    }

    public double getPerimeter() {
        return 2*(this.length + this.width);
    }

    public String toString() {
        return "width: " + this.width + "length: " + this.length + ", color: " + this.color + ", filled: " + this.filled;
    }

}
