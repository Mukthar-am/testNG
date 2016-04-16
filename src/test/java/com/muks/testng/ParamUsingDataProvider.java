package com.muks.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParamUsingDataProvider {

    @DataProvider(name = "MyDataProvider")
    public static Object[][] primeNumbers() {
        return new Object[][] {
            {2, true},
            {6, false},
            {19, true},
            {22, false},
            {23, true}
        };
    }



    @Test(dataProvider = "MyDataProvider", groups = {"selenium-tests"})
    public void testPrimeNumberChecker(Integer inputNumber, Boolean expectedResult) {
        System.out.println("# InputNumber = " + inputNumber + ", Expected = " + expectedResult);

        ParamUsingDataProvider paramUsingDataProvider = new ParamUsingDataProvider();

        Assert.assertEquals(expectedResult,
            paramUsingDataProvider.primeNumberChecker(inputNumber));
    }


    @Test
    @Parameters("name")
    public void parameterizedByXml(String myName) {
        System.out.println("@ Name = " + myName);
    }


    public Boolean primeNumberChecker(final Integer primeNumber) {
        for (int i = 2; i < (primeNumber / 2); i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

}
