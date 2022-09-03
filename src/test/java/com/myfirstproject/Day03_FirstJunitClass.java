package com.myfirstproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Day03_FirstJunitClass {
    /*
     * ******* JUNIT *******
     * Junit is a testing framework.
     * Testers use Junit when creating automation framework.
     * Developers can use Junit when creating unit test framework
     *
     * ******* ANNOTATIONS ********
     * 1. @Test => marks a method as a Test Method
     * All test methods are VOID
     * Because we create test methods for assertion, not to return a value.
     * We no longer need main method for creating and running test case
     * We can run our test methods from method level or class level
     *
     *
     * 2.@Before => Runs before EACH @Test annotation
     * 3.@After => Runs after EACH @Test annotation
     * 4.@BeforeClass => Runs before each class only once
     * 5.@AfterClass =>  Runs after each class only once
     * 6.@Ignore => Skipping the test case
     *
     * */

    @Before
    public void setUp(){
        System.out.println("BEFORE METHOD");
    }

    @After
    public void tearDown(){
        System.out.println("AFTER METHOD");
    }


    @Test
    public void test01(){
        System.out.println("This is test 1");
    }

    @Ignore
    @Test
    public void test02(){
        System.out.println("This is test 2");
    }

    @Test
    public void test03(){
        System.out.println("This is test 3");
    }

    @Test
    public void test04(){
        System.out.println("This is test 4");
    }
}