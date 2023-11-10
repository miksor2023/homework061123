package com.homework.homework061123;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int getSum(int num1, int num2){
        return num1 + num2;
    }
    public int getDifference(int num1, int num2){
        return num1 - num2;
    }
    public int getMultiplication(int num1, int num2){
        return num1 * num2;
    }
    public double getQuotient(double num1, double num2){
        return num1 / num2;
    }
}
