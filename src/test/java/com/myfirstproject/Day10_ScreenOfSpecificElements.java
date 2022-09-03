package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class Day10_ScreenOfSpecificElements extends TestBase {

        //    screenshot of google image

    @Test
    public void screenShotTest() throws IOException {
        driver.get("https://www.google.com");
        WebElement googleLogo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
        File logoImage = googleLogo.getScreenshotAs(OutputType.FILE);

//       Save the image to path
        File finalPath = new File("./test-output/elements/googleLogo.png");
        FileUtils.copyFile(logoImage,finalPath);

        //homework
        // get the screenshot of "Oturum açın" button
        WebElement signInButton = driver.findElement(By.xpath("//*[.='Oturum açın']"));
        File signInImage = signInButton.getScreenshotAs(OutputType.FILE);
        File signInPath = new File("./test-output/elements/signIn.jpeg");
        FileUtils.copyFile(signInImage,signInPath);


    }

}