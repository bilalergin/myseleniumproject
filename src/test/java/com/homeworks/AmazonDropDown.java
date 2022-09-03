package homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AmazonDropDown {
//    Create A Class: AmazonDropdown
//    Create A Method dropdownTest
//    Go to https://www.amazon.com/
//    Find the element of the dropdown element. HINT: By.id(“searchDropdownBox")
//    Print the first selected option and assert if it equals “All Departments”.If it fails, then comment that code out and continue rest of the test case.
//    Select the 4th option by index (index of 3) and assert if the name is “Amazon Devices”.(after you select you need to use get first selected option method). If it fails, then comment that code out and continue rest of the test case.
//    Print all the dropdown options-getOptions(); method returns the List<WebElement>. Using loop, print all options.
//    Print  the total number of options in the dropdown
//    Assert if ‘Appliances’ is a drop-down option. Print true if “Appliances” is an option. Print false otherwise.
//    BONUS: Assert if the dropdown is in Alphabetical Order

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
    }

    @Test
    public void dropdownTest(){

        //Find the element of the dropdown element. HINT: By.id("searchDropdownBox")
        WebElement searchDropDownBoxTest = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(searchDropDownBoxTest);


        //Print the first selected option and assert if it equals “All Departments”.
        //If it fails, then comment that code out and continue rest of the test case.
        String firstSelectedElement = select.getFirstSelectedOption().getText();
        System.out.println(firstSelectedElement);
        Assert.assertEquals("All Departments", firstSelectedElement);

    }

    @Test
    public void testIndex(){
        //Select the 4th option by index (index of 3) and assert if the name is “Amazon Devices”.
        // (after you select you need to use get first selected option method).
        //If it fails, then comment that code out and continue rest of the test case.
        WebElement searchDropDownBoxTest = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(searchDropDownBoxTest);

        String index3 = select.getFirstSelectedOption().getText();
        System.out.println(index3);
        Assert.assertEquals("Amazon Devices", index3);
    }

    @Test
    public void testPrintAll (){
        //Print all the dropdown options-getOptions(); method returns the List<WebElement>. Using loop, print all options.
        WebElement searchDropDownBoxTest = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(searchDropDownBoxTest);

        List<WebElement> allOptions = select.getOptions();
        for (WebElement eachElements : allOptions){
            System.out.println(eachElements.getText());

        }

    }


    @Test
    public void testTotalNum(){
        //Print  the total number of options in the dropdown
        WebElement searchDropdownBosTest = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(searchDropdownBosTest);

        List<WebElement> allOptions = select.getOptions();
        System.out.println(allOptions.size());

    }

    @Test
    public void testAppliances(){
        //Assert if ‘Appliances’ is a drop-down option. Print true if “Appliances” is an option. Print false otherwise.
        WebElement searchDropdownBosTest = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(searchDropdownBosTest);

        List<WebElement> allOptions = select.getOptions();
        boolean flag = false;
        for (WebElement eachOptions : allOptions) {
            if (eachOptions.getText().equals("Appliances")){
                flag = true;
            }
        }
        Assert.assertTrue(flag);

    }

    @Test
    public void testAlphabeticalOrder(){
        //BONUS: Assert if the dropdown is in Alphabetical Order
        WebElement searchDropdownBosTest = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(searchDropdownBosTest);

        List<WebElement> allOptions = select.getOptions();
        List<String> actualList = new ArrayList<>();
        for (WebElement eachOptions : allOptions){
            actualList.add(eachOptions.getText());
        }

        List<String> sortedlist = actualList.stream().sorted().collect(Collectors.toList());
        Assert.assertTrue("Not Alphabetical order", actualList.equals(sortedlist));
    }


    @After
    public void tearDown(){
        driver.close();
    }



}