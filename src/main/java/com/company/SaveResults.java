package com.company;


import java.util.ArrayList;


public class SaveResults {
    public static double value;
    static ArrayList <Double> arrayResults = new ArrayList<>();

//To add conversion results to list
    public static ArrayList<Result> saveToList() {
        arrayResults.add(value);
        return null;
    }

    @Override
    public String toString() {
        return String.valueOf(arrayResults);
    }
}


