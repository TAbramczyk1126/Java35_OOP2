package org.futurecollars.lesson4.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsoleMessageTest {

    @Test
    void shouldReturnConsoleMessage() {
        //Given
        String expectedText = "This is class ConsoleMessage";
        ConsoleMessage consoleMessage = new ConsoleMessage();
        //When
        String actualText = consoleMessage.getMessage();
        //Then
        assertEquals(expectedText, actualText);
    }

    @Test
    void shouldReturnConsoleMessage2() {
        //Given
        ConsoleMessage consoleMessage = new ConsoleMessage();
        //When
        //Then
        assertEquals("This is class ConsoleMessage", consoleMessage.getMessage());
    }
}
