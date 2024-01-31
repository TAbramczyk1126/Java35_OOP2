package org.futurecollars.lesson4.task2;

public class Rectangle extends Shape {

    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int getArea() {
        return sideA * sideB;
    }

    @Override
    public int getPerimeter() {
        return (sideA + sideB) * 2;
    }
}
