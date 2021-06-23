package com.company;

import java.io.*;
import java.util.ArrayList;
import java.io.FileOutputStream;

import static com.company.SaveResults.arrayResults;


public class FileWriter {

    public FileWriter(Object file) {
    }
//To write conversion results to a file
    public static void fileWriter() {
        ArrayList<Double> results = arrayResults;
//        String resultString = "";
//        for (int i = 0; i< SaveResults.arrayResults.size(); i++){
//            Double temp = results.get(i).value;
//            resultString += String.valueOf(temp);
//            resultString += " ";
//        }
        try{
            File file = new File("C:\\Users\\Kate\\Desktop\\results2.txt");
            BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(file));
           writer.write(String.valueOf(arrayResults));
           writer.close();

            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Kate\\Desktop\\results.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            // To save Object to file
            objectOutputStream.writeObject(results);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
