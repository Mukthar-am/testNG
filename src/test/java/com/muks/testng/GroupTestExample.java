package com.muks.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by mukthar.ahmed on 4/16/16.
 */
public class GroupTestExample {

    @Test(groups={"method1"})
    public void testingMethod1() {
        System.out.println("Method - testingMethod1()");
    }

    @Test(groups="method2")
    public void testingMethod2() {
        System.out.println("Method - testingMethod2()");
    }

    @Test(groups="method1")
    public void testingMethod3() {
        System.out.println("Method - testingMethod1_1()");
    }

    @Test(groups={"integration"})
    public void testingMethod4() {
        System.out.println("Method - testingMethod4()");
    }


}
