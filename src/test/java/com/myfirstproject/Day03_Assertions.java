package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;

public class Day03_Assertions {

    @Test
    public void assertions(){
        /*
         * **** ASSERTIONS ******
         * if expected = actual
         * if assertion fails we see red error
         * if assertion passes we see green tick
         *
         * ****Interview Question*****
         * What is difference between Assertion and Verification?
         * When assertion fails, test stops execution. Assertion means Hard Assert
         * Verification means, test will continue to execute even after verification fails
         *
         * In TestNG there is SoftAssert. It means verification
         * In verification we can mark more than one result as passed or failed
         *
         *
         * */


//        1.Assert.assertEquals();
//        Assert.assertEquals("java","javascript");
//        org.junit.ComparisonFailure:
//        Expected :java
//        Actual   :javascript

//        Assert.assertEquals("TEST HAS FAILED","java","javascript");
//        org.junit.ComparisonFailure: TEST HAS FAILED
//        Expected :java
//        Actual   :javascript

        Assert.assertEquals(5,5);


//        2.assertTrue(BOOLEAN);
        Assert.assertTrue("SELENIUM".contains("E"));//PASS

//        3.assertFalse(BOOLEAN);
        Assert.assertFalse("SELENIUM".contains("A"));//PASS
        Assert.assertFalse("SELENIUM".contains("E"));//FAIL

    }


}