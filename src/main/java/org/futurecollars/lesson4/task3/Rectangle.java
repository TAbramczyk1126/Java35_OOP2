package org.futurecollars.lesson4.task3;

public class Rectangle implements MatchOperationOnTheFigures {

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
    return (2 * (sideA + sideB));
    }
}
