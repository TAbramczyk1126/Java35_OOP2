package org.futurecollars.lesson4.task2;

public class Triangle extends Shape {

    private int baseLength;
    private int height;
    private int adjoining;
    private int hypotenuse;

    public Triangle(int baseLength, int height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    public Triangle(int baseLength, int adjoining, int hypotenuse) {
        this.baseLength = baseLength;
        this.adjoining = adjoining;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public int getArea() {
        return (baseLength * height) / 2;
    }

    @Override
    public int getPerimeter() {
        return (baseLength + adjoining + hypotenuse);
    }
}
