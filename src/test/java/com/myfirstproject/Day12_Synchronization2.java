package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Day12_Synchronization2 extends TestBase {
    @Test
    public void Synchronization2Test() throws InterruptedException {
        //Go to https://the-internet.herokuapp.com/dynamic_loading/2

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        //    When user clicks on the Start button
        WebElement startButton = driver.findElement(By.xpath("//div[@id='start']//button"));

        clickByJS(startButton);
        WebElement message = driver.findElement(By.xpath("//div[@id='finish']//h4"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Then verify the ‘Hello World!’ Shows up on the screen
        Assert.assertEquals("Hello World!", message.getText());

    }
}