package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_GetPageSource {

        //    TEST CASE:
//    Test if amazon contains “Registry” on the homepage
//    Create a new class : GetPageSource

    public static void main(String[] args) {

        //        System.setProperty("webdriver.gecko.driver","./drivers/geckodriver");//mac
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); //windows

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //navigate to Amazon Webpage
        driver.get("https://www.amazon.com");

        // Test if amazon contains “Registry” on the homepage
        String pageSource = driver.getPageSource();
//        System.out.println(pageSource);

        if(pageSource.contains("Registry")){
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        driver.quit();
    }

}
