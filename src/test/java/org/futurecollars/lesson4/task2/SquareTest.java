package org.futurecollars.lesson4.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

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
    void shouldReturnSquarePerimeterValue() {
        // Given
        int expectedPerimeter = 20;
        Square square = new Square(5);
        // When
        int result = square.getPerimeter();
        // Then
        assertEquals(expectedPerimeter, result);
    }
}
