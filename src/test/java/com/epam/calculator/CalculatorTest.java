package com.epam.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
 private  static  final  double DELTA = 0.000001;
    @Test
    public void testAddShouldAddWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(1, 2);

        //Then
        Assert.assertEquals(3, result);
    }


    @Test
    public void testAddShouldAddWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(-1, -2);

        //Then
        Assert.assertEquals(-3, result);
    }

    @Test
    public void testGetDegreeShouldGetDegreeWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.getDegree(3, 3);

        //Then
        Assert.assertEquals(27, result,DELTA);
    }

    @Test
    public void testGetDegreeShouldGetDegreeWhenSecondNumberNull() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.getDegree(3, 0);

        //Then
        Assert.assertEquals(1, result,DELTA);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenNumbersNotNull() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.multiply(7, 5);

        //Then
        Assert.assertEquals(35, result,DELTA);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenAnyNumberNull() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.multiply(0, 5);

        //Then
        Assert.assertEquals(0, result,DELTA);
    }

   @Test
    public void testDivideShouldDivideWhenAnyNumberNegative(){
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.divide(-15,5);

        //Then
        Assert.assertEquals(-3, result,DELTA);
    }

    @Test
    public void testDivideShouldDivideWhenBothNumbersNegative(){
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.divide(-15,-5);

        //Then
        Assert.assertEquals(3, result,DELTA);
    }

}
