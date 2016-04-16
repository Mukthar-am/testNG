package com.muks.testng.multi_threaded_tests;

import org.testng.annotations.Test;

/**
 * Created by mukthar.ahmed on 4/17/16.
 */
public class MultiThreadedMethodRuns {

    @Test(threadPoolSize = 3, invocationCount = 3, timeOut = 1000)
    public void MultiThreadedMethodRun() {
        System.out.println("# ID = " + Thread.currentThread().getId() );
    }
}
