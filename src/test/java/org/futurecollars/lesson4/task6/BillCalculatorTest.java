package org.futurecollars.lesson4.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BillCalculatorTest {

    @Test
    void calculate() {
        //given
        BillCalculator billCalculator = new BillCalculator();
        //when
        double result = billCalculator.Calculate(100, 10);
        //then
        assertEquals(110, result);


    }

    @Test
    void testCalculate() {
    }

    @Test
    void testCalculate1() {
    }
}