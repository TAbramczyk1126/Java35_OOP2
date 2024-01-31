package org.futurecollars.lesson4.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillCalculatorTest {

    @Test
    void shouldReturnValueOfTheBillWithService() {
        //given
        double expected = 110;
        BillCalculator billCalculator = new BillCalculator();
        //when
        double result = billCalculator.Calculate(100, 10);
        //then
        assertEquals(expected, result);
    }

    @Test
    void shouldReturnValueOfTheBillWithServiceAndDiscount() {
        //given
        double expected = 50.7;
        BillCalculator billCalculator = new BillCalculator();
        //when
        double result = billCalculator.Calculate(100.5, 10.5F, 0.6);
        //then
        assertEquals(expected, result);
    }

    @Test
    void shouldReturnValueOfTheBillWithServiceAndPackaging() {
        //given
        double expected = 113;
        BillCalculator billCalculator = new BillCalculator();
        //when
        double result = billCalculator.Calculate(100.5, 10.5F, (short) 2);
        //then
        assertEquals(expected, result);
    }
}