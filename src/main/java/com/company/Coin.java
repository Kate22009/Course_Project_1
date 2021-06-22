package com.company;

public abstract class Coin implements ICalculate {
// abstract method that returns double
    public abstract double getValue();

    @Override
    public double calculate(double value) {
        return value;
    }


}
