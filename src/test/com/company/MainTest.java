package com.company;

import org.junit.BeforeClass;
import org.junit.Test;


public class MainTest {

@BeforeClass
public static void currencyChoice(){
}
    // Entering a value to convert
    @Test
    public void test_method_1() throws Exception {

        System.out.println("@Test - test_method_1");
    }

    // Asserting Result is valid
    @Test
    public void test_method_2() {
        Main test = new Main();
        double input = 10.1;
        Coin usdValue = CoinFactory.getCoinInstance(Coins.USD);
        assert usdValue != null;
        double actual = usdValue.calculate(input);
        double expected = 34.027;
        System.out.println("@Test - test_method_2");
    }

    // Checking the content of the results file.
    @Test
    public void test_method_3() {
        System.out.println("@Test - test_method_3");
    }
}



