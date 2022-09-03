package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class screenShotOfSpecificElementTest01 extends TestBase {
    @Test
    public void screenShotOfSpecificElementTest01() throws IOException {
        //Get the defined address

        driver.get("https://www.google.com");
        WebElement signInButton = driver.findElement(By.linkText("Oturum açın"));
        File SignInBtnImg = signInButton.getScreenshotAs(OutputType.FILE);

// Save the image to path
        File finalPath = new File("./test-output/elements/signInButton.png");
        FileUtils.copyFile(SignInBtnImg,finalPath);
    }
}
