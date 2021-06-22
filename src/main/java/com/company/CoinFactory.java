package com.company;

public class CoinFactory {
    //use getCoinInstance method to get object of type coin
    public static Coin getCoinInstance(Coins coin) {
        switch (coin) {
            case ILS:
                return new ILS();
            case USD:
                return new USD();

        }

        return null;
    }
}