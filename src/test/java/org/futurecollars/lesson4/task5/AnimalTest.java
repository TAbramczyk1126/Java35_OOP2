package org.futurecollars.lesson4.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void shouldReturnAnimalName() {
        // given
        String expectedName = "Simba";
        Animal animal = new Animal("Simba") {
        };
        // when
        String result = animal.name;
        // then
        assertEquals(expectedName, result);
    }
}
