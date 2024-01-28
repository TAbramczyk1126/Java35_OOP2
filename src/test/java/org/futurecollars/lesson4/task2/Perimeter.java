package org.futurecollars.lesson4.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Perimeter {

    @Test
    void shouldReturnCirclePerimeterValue() {
        // Given
        int expectedPerimeter = 25;
        Circle circle = new Circle(4);
        // When
        int result = circle.getPerimeter();
        // Then
        assertEquals(expectedPerimeter, result);
    }

    @Test
    void shouldReturnRectanglePerimeterValue() {
        // Given
        int expectedPerimeter = 12;
        Rectangle rectangle = new Rectangle(4, 2);
        // When
        int result = rectangle.getPerimeter();
        // Then
        assertEquals(expectedPerimeter, result);
    }

    @Test
    void shouldReturnSquarePerimeterValue() {
        // Given
        int expectedPerimeter = 20;
        Square square = new Square(5);
        // When
        int result = square.getPerimeter();
        // Then
        assertEquals(expectedPerimeter, result);
    }

    @Test
    void shouldReturnTrianglePerimeterValue() {
        // Given
        int expectedPerimeter = 15;
        Triangle triangle = new Triangle(15, 5);
        // When
        int result = triangle.getPerimeter();
        // Then
        assertEquals(expectedPerimeter, result);
    }
}
