package com.muks.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Vector;

/**
 * Created by mukthar.ahmed on 4/16/16.
 *
 */
public class ParameterizedTests {
    // Using testing.xml file to parameterize
    @Test
    @Parameters(value="number")
    public void parameterIntTest(int number) {
        System.out.println("Parameterized Number is : " + number);
    }


    // Using data-provider
    @Test(dataProvider = "Data-Provider-Function")
    public void parameterIntTest(Class clzz, String[] number) {
        System.out.println("Parameterized Number is : " + number[0]);
        System.out.println("Parameterized Number is : " + number[1]);
    }

    //This function will provide the patameter data
    @DataProvider(name = "Data-Provider-Function")
    public Object[][] parameterIntTestProvider() {
        return new Object[][]{
            {Vector.class, new String[] {"java.util.AbstractList", "java.util.AbstractCollection"}},
            {String.class, new String[] {"1", "2"}},
            {Integer.class, new String[] {"1", "2"}}
        };
    }




//    @Test(dataProvider = "Data-Provider-Function")
//    public void parameterIntTest(ParameterizedTests clzz) {
//        System.out.println("Parameterized Number is : " + clzz.getMsg());
//        System.out.println("Parameterized Number is : " + clzz.getNumber());
//    }
//
//    //This function will provide the patameter data
//    @DataProvider(name = "Data-Provider-Function2")
//    public Object[][] parameterIntTestProvider2() {
//
//        ParameterizedTests obj = new ParameterizedTests();
//        obj.setMsg("Hello");
//        obj.setNumber(123);
//
//        return new Object[][]{
//            {obj}
//        };
//    }
}
