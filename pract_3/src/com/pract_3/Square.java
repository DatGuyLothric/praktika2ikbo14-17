package com.pract_3;

public class Square extends Rectangle {

    public Square() {
        this.width = 10.0;
        this.length = 5.0;
        this.color = "000000";
        this.filled = false;
    }
    public Square(double side) {
        this.width = side;
        this.length = side;
        this.color = "000000";
        this.filled = false;
    }

    public Square(double side, String color, boolean filled) {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
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
