package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyURLTest {

        //        1.Create a new class: VerifyURLTest
//        2.Navigate to google homepage
//        3.Verify if google homepage url is “www.google.com”

    public static void main(String[] args) {

        //        System.setProperty("webdriver.gecko.driver","./drivers/geckodriver");//mac
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); //windows

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //navigate to google
        driver.get("https://www.google.com");

        //3.Verify if google homepage url is “www.google.com”
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "www.google.com";

        if(actualURL.equals(expectedURL)){
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
            System.out.println("Actual: " + actualURL);
            System.out.println("Expected: " + expectedURL);
        }

        /*
        FAILED
        Actual: https://www.google.com/
         Expected: www.google.com
         IQ: What do you do if a test case fails?
         1.Re-run your test one more time
         2.Do manual testing to be sure
         3.Contact with Developer
         4.Contact with BA
           -Check if this is document issue(spelling mistake..)
           -If the is documentation, then let BA fix the documents
           -And correct your test case
         5.If this is an actual bug  ?
         -Raise a bug ticket in JIRA
         -Assign it to developer
         6.After developer fixes the issue, deploy the code test environment
         -Retest manually, then run automation script.
         -And close the ticket if all good!

         Note: Each company has a different culture!

         When you find a bug, do you fix the bug your self?
         -Nope. I document and report.

         */

    }

}