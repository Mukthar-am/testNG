package com.muks.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by mukthar.ahmed on 4/13/16.
 */
public class TestRegressions {
    private static String tag = "[Regression]: ";
    @BeforeClass
    public static void oneTimeSetUp() {
        System.out.println(tag + "# @BeforeClass - oneTimeSetup()");
    }

    @AfterClass
    public static void oneTimeTearDown() {
        System.out.println(tag + "# @AfterClass - oneTimeTearDown()");
    }


    @Test
    public static void testSampleOne() {
        System.out.println(tag + "# Test # 1");
    }

    @Test
    public void testSampleTwo() {
        Reporter.log("PASS");
    }

    @Test
    public void testSampleThree() {
        Assert.assertEquals("onetwo","onetwo");
    }
}
