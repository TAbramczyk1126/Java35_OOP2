package org.futurecollars.lesson4.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

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
