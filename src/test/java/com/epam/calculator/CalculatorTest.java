package com.epam.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddShouldAddWhenNumbersPositive(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(1,2);

        //Then
        Assert.assertEquals(3, result);
    }

    @Test
    public void testAddShouldAddWhenNumbersNegative(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(-1,-2);

        //Then
        Assert.assertEquals(-3, result);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenNumbersNotNull(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.multiply(7,5);

        //Then
        Assert.assertEquals(35, result);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenFirstNumberNull(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.multiply(0,5);

        //Then
        Assert.assertEquals(0, result);
    }

    @Test
    public void testDivideShouldAddWhenNumbersBothEvenOrOdd(){
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.intDivide(17,13);

        //Then
        Assert.assertEquals(17/13, result);
    }

}
