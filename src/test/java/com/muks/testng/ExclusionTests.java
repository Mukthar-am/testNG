package com.muks.testng;

import org.testng.annotations.Test;

/**
 * Created by mukthar.ahmed on 4/16/16.
 */
public class ExclusionTests {

    @Test
    public void testOne(){
        System.out.println("# testone() method excluded from testing.xml ");
    }

    @Test(enabled = false)      /** "enabled=false" is the annotation to disable test */
    public void testExclude() {
        System.out.println("# This test is excluded");
    }

    /**
     <test name="IntegrationTests">
        <classes>
            <class name="com.muks.testng.TestRegressions">
                <methods>
                    <include name="testSampleOne"/>
                    <include name="testSampleTwo"/>

                    <exclude name="testSampleThree"/>

                </methods>
            </class>
        </classes>
     </test>

     * */
}
