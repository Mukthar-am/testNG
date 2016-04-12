package com.muks.testng;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

/**
 * Unit test for simple App.
 */
public class TestApp {
    @BeforeClass
    public static void oneTimeSetUp() {
        System.out.println("# @BeforeClass - oneTimeSetup()");
    }

    @AfterClass
    public static void oneTimeTearDown() {
        System.out.println("# @AfterClass - oneTimeTearDown()");
    }

    @BeforeTest
    public static void beforeEveryTests() {
        System.out.println("# Before every test");
    }

    @AfterTest
    public static void afterEveryTests() {
        System.out.println("# After every test");
    }

    @Test
    public static void testSampleOne() {
        System.out.println("# Test # 1");
    }

    @Test
    public void testSampleTwo() {
        Reporter.log("PASS");
    }

    @Test
    public void testSampleThree() {
        Assert.assertEquals("onetwo","Onetwo");
    }
}
