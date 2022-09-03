package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_ThreadSleep {

    public static void main(String[] args) throws InterruptedException {

        //        System.setProperty("webdriver.gecko.driver","./drivers/geckodriver");//mac
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); //windows

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        //Wait for 5 seconds in Google page
        Thread.sleep(5000);

        driver.get("https://www.amazon.com");

        //wait for 10 seconds in Amazon page
        Thread.sleep(10000);

        driver.quit();

        /*
        Thread.sleep is a Java wait
        It doesn't come from selenium
        It is a hard wait
        It means driver will wait here for 5 seconds under every condition
        If driver does not need any wait, it will still wait for 5 seconds
        Testers should avoid this wait, Thread.sleep puts unnecessary waitings
        We will learn Selenium Implicit and Explicit waits in upcoming classes

        Thread.sleep throws exception, we should add exception to method signature, or we should use try catch block
         */

    }
}