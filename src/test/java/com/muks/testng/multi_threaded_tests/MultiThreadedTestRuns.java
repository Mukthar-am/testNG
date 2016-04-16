package com.muks.testng.multi_threaded_tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by mukthar.ahmed on 4/17/16.
 *
 * Example showing that tests can be run in multi threaded mode
 *
 * http://howtodoinjava.com/testng/testng-executing-parallel-tests/
 *
 */


/*
        Tests are run by multiple threads
 */

public class MultiThreadedTestRuns {
    @BeforeMethod
    public void beforeMethod() {
        long id = Thread.currentThread().getId();
        System.out.println("Before test-method. Thread id is: " + id);
    }

    @Test
    public void testMethodsOne() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method One. Thread id is: " + id);
    }

    @Test
    public void testMethodsTwo() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method Two. Thread id is: " + id);
    }

    @AfterMethod
    public void afterMethod() {
        long id = Thread.currentThread().getId();
        System.out.println("After test-method. Thread id is: " + id);
    }

}
