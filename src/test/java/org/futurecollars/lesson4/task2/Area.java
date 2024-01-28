package org.futurecollars.lesson4.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Area {
    @Test
    void shouldReturnCircleAreaValue() {
        // Given
        int expectedArea = 50;
        Circle circle = new Circle(4);
        // When
        int result = circle.getArea();
        // Then
        assertEquals(expectedArea, result);
    }

    @Test
    void shouldReturnRectangleAreaValue() {
        // Given
        int expectedArea = 8;
        Rectangle rectangle = new Rectangle(4, 2);
        // When
        int result = rectangle.getArea();
        // Then
        assertEquals(expectedArea, result);
    }

    @Test
    void shouldReturnSquareAreaValue() {
        // Given
        int expectedArea = 25;
        Square square = new Square(5);
        // When
        int result = square.getArea();
        // Then
        assertEquals(expectedArea, result);
    }

    @Test
    void shouldReturnTriangleAreaValue() {
        // Given
        int expectedArea = 37;
        Triangle triangle = new Triangle(15, 5);
        // When
        int result = triangle.getArea();
        // Then
        assertEquals(expectedArea, result);
    }
}
