package org.futurecollars.lesson4.task2;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public int getPerimeter() {
        return (int) (2 * Math.PI * radius);
    }
}
