package org.futurecollars.lesson4.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {
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
    void shouldReturnCirclePerimeterValue() {
        // Given
        int expectedPerimeter = 25;
        Circle circle = new Circle(4);
        // When
        int result = circle.getPerimeter();
        // Then
        assertEquals(expectedPerimeter, result);
    }
}
