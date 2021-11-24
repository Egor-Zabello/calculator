package com.epam.calculator;

public class Calculator {
    public int add(int first, int second) {
        return first+second;
    }

   public int multiply(int first, int second) {
        return first*second;
    }

    public double intDivide(int first, int second) {

        if (first+second % 2==0){
        return first/second;
        }
        return 0;
    }
}
