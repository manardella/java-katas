package com.exersices.sofia;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    //http://osherove.com/tdd-kata-1/

    StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void shouldReturnZeroForEmptyString() {

        String inputValue = "";
        int expectedResult = 0;

        int result = stringCalculator.add(inputValue);

        assertEquals(expectedResult, result);

    }

    @Test
    public void shouldReturnOneForInputOne() {

        String inputValue = "1";
        int expectedResult = 1;

        int result = stringCalculator.add(inputValue);

        assertEquals(expectedResult, result);

    }

    @Test
    public void shouldReturnSumOfTwoNumbers() {

        String inputValue = "1,2";
        int expectedResult = 3;

        int result = stringCalculator.add(inputValue);

        assertEquals(expectedResult, result);

    }

    @Test
    public void shouldReturnSumOfUnlimitedNumbers() {

        String inputValue = "1,2,4,5,6";
        int expectedResult = 18;

        int result = stringCalculator.add(inputValue);

        assertEquals(expectedResult, result);

    }

    @Test
    public void shouldHandleNewLinesBetweenNumbers() {

        String inputValue = "1\\n2,3";
        int expectedResult = 6;

        int result = stringCalculator.add(inputValue);

        assertEquals(expectedResult, result);

    }

}
