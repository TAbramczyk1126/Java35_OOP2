package org.futurecollars.lesson4.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageTest {

    @Test
    void shouldReturnConsoleMessage() {
        //Given
        String expextedText = "This is class ConsoleMessage";
        Message consoleMessage = new ConsoleMessage();
        //When
        String actualText = consoleMessage.getMessage();
        //Then
        assertEquals(expextedText, actualText);
    }

    @Test
    void shouldReturnWindowsMessage() {
        //Given
        String expextedText = "This is class WindowMessage";
        Message windowMessage = new WindowMessage();
        //When
        String actualText = windowMessage.getMessage();
        //Then
        assertEquals(expextedText, actualText);
    }
}
