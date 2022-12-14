package com.myfirstproject;
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class Day08_Actions2 extends TestBase {
    /*Create a class: Actions2
    Create test method : hoverOver() and test the following scenario:
    Given user is on the https://www.amazon.com/
    When use click on “Account” link
    Then verify the page title contains “Your Account”

     */
    @Test
    public void hoverOver(){
//        Given user is on the https://www.amazon.com/
        driver.get("https://www.amazon.com/");
//        When use click on “Account” link
        /*We must move the mouse over to the Account&List
         * so Account link can be visible
         * Account link is currently hidden*/
        WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(accountList).perform();
//        Clicking on the Account link
        driver.findElement(By.linkText("Account")).click();
//        Then verify the page title contains “Your Account”
        Assert.assertTrue(driver.getTitle().contains("Your Account"));
    }
}