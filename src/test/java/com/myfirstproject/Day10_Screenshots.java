package com.myfirstproject;
import com.myfirstproject.utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Day10_Screenshots extends TestBase {
    /*
     * In Testing, Screenshot is very essential
     * Documentation of test results
     *
     * Test Reports should have test cases(test steps), test result(fails, passes), screenshots
     *
     * If our test fails, we need screenshot to raise a bug ticket.
     * If our test passes, we should get a screenshot as a proof.
     *
     * With Selenium 3 & 4 we can get screenshot by using TakeScreenshot class and getScreenshotAs()
     * to be able to get screenshot of a webpage
     *
     * With Selenium 4, we can take screenshot of a specific element
     *
     *
     * */
    @Test
    public void screenShotTest() throws IOException {
        driver.get("https://www.google.com");
        takeScreenShot();
        driver.findElement(By.name("q")).sendKeys("Adana kebap" + Keys.ENTER);
        takeScreenShot();
    }

    public void takeScreenShot() {
    }
    /*
     * How do you get screenshot in your automation framework?
     * I can use getScreenshotAs() method to capture the screenshot
     * Actually we will have reusable methods for screenshots.
     *
     *
     *
     * */
}