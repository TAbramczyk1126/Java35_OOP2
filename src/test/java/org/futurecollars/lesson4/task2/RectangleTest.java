package org.futurecollars.lesson4.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

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
    void shouldReturnRectanglePerimeterValue() {
        // Given
        int expectedPerimeter = 12;
        Rectangle rectangle = new Rectangle(4, 2);
        // When
        int result = rectangle.getPerimeter();
        // Then
        assertEquals(expectedPerimeter, result);
    }
}
