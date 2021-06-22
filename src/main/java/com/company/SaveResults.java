package com.company;


import java.io.*;
import java.util.ArrayList;


public class SaveResults {
    private static final String FILE_NAME = "testSer.ser";

    public static Result value;
    static ArrayList<Result> arrayResults = new ArrayList<Result>();
//To serialize and deserialize objects of the array list Result.
    public void SaveResults() {
        try (FileOutputStream fos = new FileOutputStream(FILE_NAME);
             //Creating stream and writing the object
             ObjectOutputStream os = new ObjectOutputStream(fos)) {
            os.writeObject(arrayResults);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (FileInputStream fis = new FileInputStream("testSer.ser");
             //Creating stream to read the object
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            arrayResults = (Result) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }
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


