package ru.practice_3.three_one;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){
        color = "Blue";
        filled = false;
    }

    public Shape(String color, boolean filled){
        this.color = "Blue";
        this.filled = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

class Circle extends Shape {
    protected double radius;

    public Circle(){
        this.color = "Yellow";
        this.filled = false;
        radius = 2;
    }

    public Circle(double radius){
        this.color = "Yellow";
        this.filled = false;
        this.radius = radius;
    }

    public Circle(String color, double radius, boolean filled){
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    double getPerimeter() {
        return 2*3.14*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", radius=" + radius +
                '}';
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this.color = "Red";
        this.filled = true;
        this.width = 4;
        this.length = 5;
    }

    public Rectangle(double width, double length) {
        this.color = "Red";
        this.filled = true;
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return length*width;
    }

    @Override
    double getPerimeter() {
        return 2*length+2*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}

class Square extends Rectangle {
    protected double side;

    public Square() {
        this.color = "Red";
        this.filled = true;
        this.side = 5;
    }

    public Square(double side) {
        this.color = "Red";
        this.filled = true;
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", width=" + width +
                ", length=" + length +
                ", side=" + side +
                '}';
    }
}
