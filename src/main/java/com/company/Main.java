package com.company;

import java.util.Scanner;

import static com.company.FileWriter.fileWriter;
import static com.company.SaveResults.arrayResults;
import static com.company.SaveResults.saveToList;

public class Main {

    public static void main(String[] args) {
        String welcome = "Welcome to currency converter";
        System.out.println(welcome);
        while (true) {

            int currency = -1;
            while (true) {
                String screen1 = "Please choose an option (1/2):\n 1. Dollars to Shekels\n 2. Shekels to Dollars";

                System.out.println(screen1);
                Scanner curChoice = new Scanner(System.in);

                String strCurrency = curChoice.next();
                if (strCurrency.equals("1") || strCurrency.equals("2")) {
                    currency = Integer.parseInt(strCurrency);
                    break;
                }
                System.out.println("Input invalid");
            }


                        if (currency == 1) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Your choice - Dollars to Shekels. Please enter an amount to convert");
                double input = scanner1.nextDouble();
                Coin usdValue = CoinFactory.getCoinInstance(Coins.USD);
                assert usdValue != null;
                double value = usdValue.calculate(input);
                Result result = new Result(value, "USD to ISL");
                System.out.println(value);

                //To save results to a list.
                SaveResults.value = result;
                saveToList();

            } else {
                if (currency == 2) {
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Your choice - Shekels to Dollars. Please enter an amount to convert");
                    double input = scanner2.nextDouble();
                    Coin ilsValue = CoinFactory.getCoinInstance(Coins.ILS);
                    assert ilsValue != null;
                    double value = ilsValue.calculate(input);
                    Result result = new Result(value, "ISL to USD");
                    System.out.println(value);
                    //To save results to a list.
                    SaveResults.value = result;
                    saveToList();

                } else {
                    System.out.println("Invalid choice. Please choose an option 1 or 2");

                        }

            }

            // Question
            System.out.println("Do you want to start over?");
            Scanner cycle = new Scanner(System.in);
            String answer = cycle.nextLine();

            if (answer.equalsIgnoreCase("Y")) {

            } else {
                if (answer.equalsIgnoreCase("N")) {
                    System.out.println("Thanks for using our currency converter");
                    // Will print all previous results from results list.

                    System.out.println(arrayResults);

                     fileWriter();

                } else {
                    System.out.println("Invalid answer");
                } break;
            }

        }

    }
}

