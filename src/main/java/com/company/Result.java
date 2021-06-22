package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class Result extends ArrayList<Result> implements Serializable {
    public double value;
    public String currency;

//Constructor of Result class Object  that gets double value and String currency
    public Result (double value, String currency) {
       this.value = value;
       this.currency = currency;
    }
  }
