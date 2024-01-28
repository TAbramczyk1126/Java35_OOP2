package org.futurecollars.lesson4.task2;

public class Square extends Shape {

    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getArea() {
        return sideLength * sideLength;
    }

    @Override
    public int getPerimeter() {
        return sideLength * 4;
    }
}
