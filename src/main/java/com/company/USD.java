package com.company;

public class USD extends Coin {

    private final double value = 3.27;

    @Override
    public double getValue() {

        return value;
    }
//Call getValue() method from calculate() inside both USD and ILS classes to perform the
//calculation.
    @Override
    public double calculate(double input) {
        return input * getValue();

    }
}
