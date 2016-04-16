package com.muks.testng;

import org.testng.annotations.Test;

/**
 * Created by mukthar.ahmed on 4/16/16.
 */
public class DependencyTests {

    @Test
    public void method1() {
        System.out.println("This is method 1");
    }

    @Test(dependsOnMethods={"method1"})
    public void method2() {
        System.out.println("This is method 2");
    }
}
