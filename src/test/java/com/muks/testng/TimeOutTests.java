package com.muks.testng;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

/**
 * Created by mukthar.ahmed on 4/16/16.
 */
public class TimeOutTests {

    //@Test(timeOut = 1000, expectedExceptions = ThreadTimeoutException.class)

    @Test(timeOut = 1000)
    public void infinity() {
        while (true);
    }
}
