package org.futurecollars.lesson4.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextFormatterTest {

    @Test
    void shouldReturnTextInCapitalLetter() {
        // Given
        String expectedText = "THIS IS A TEXT IN CAPITAL LETTER";
        TextFormatter capitalLetter = new CapitalLetter();
        String text = "This is a text in capital letter";
        // When
        String formattedText = capitalLetter.formatText(text);
        // Then
        assertEquals(expectedText, formattedText);
    }

    @Test
    void shouldReturnTextInSmallLetter() {
        // Given
        String expectedText = "this is a text in small letter";
        TextFormatter smallLetter = new SmallLetter();
        String text = "This is a text in small letter";
        // When
        String formattedText = smallLetter.formatText(text);
        // Then
        assertEquals(expectedText, formattedText);
    }
}
