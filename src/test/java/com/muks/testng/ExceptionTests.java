package com.muks.testng;

import org.testng.annotations.Test;

/**
 * Created by mukthar.ahmed on 4/16/16.
 */
public class ExceptionTests {

    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithException() {
        int i = 1/0;
    }

}
