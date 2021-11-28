package com.epam.calculator;

public class Calculator {
    public int add(int first, int second) {
        return first+second;
    }

    public double getDegree(int first, int second) {
        return Math.pow(first,second);
    }

   public double multiply(int first, int second) {
        return first*second;
    }

    public double divide(int first, int second) {
        return first/second;
    }
}
