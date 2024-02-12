package org.futurecollars.lesson4.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextFormatterTest {

    @Test
    void shouldReturnTextInCapitalLetter() {
        // Given
        String expectedText = "THIS IS A TEXT IN CAPITAL LETTER";
        UpperCaseFormatter capitalLetter = new UpperCaseFormatter();
        String text = "This is a text in capital letter";
        // When
        String formattedText = text.toUpperCase();
        // Then
        assertEquals(expectedText, formattedText);
    }

    @Test
    void shouldReturnTextInSmallLetter() {
        // Given
        String expectedText = "this is a text in small letter";
        LowerCaseFormatter smallLetter = new LowerCaseFormatter();
        String text = "This is a text in small letter";
        // When
        String formattedText = text.toLowerCase();
        // Then
        assertEquals(expectedText, formattedText);
    }
}
