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
import java.util.Collections;
import java.util.List;

public class Day05AmazonHomework {
    private WebDriver driver;
    private final String urlPath = "https://www.amazon.com/";
    private final By searchDropdownBoxBy = By.id("searchDropdownBox");

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(urlPath);

    }
    /*
//    Create A Class: AmazonDropdown
//    Create A Method dropdownTest
//    Go to https://www.amazon.com/
//    Find the element of the dropdown element. HINT: By.id("searchDropdownBox")
//    Print the first selected option and assert if it equals "All Departments".
//    If it fails, then comment that code out and continue rest of the test case.
//    Select the 4th option by index (index of 3) and assert if the name is "Amazon Devices".(after you select you need to use get first selected option method). If it fails, then comment that code out and continue rest of the test case.
//    Print all of the dropdown options-getOptions(); method returns the List<WebElement>. Using loop, print all options.
//    Print the the total number of options in the dropdown
//    Assert if 'Appliances' is a drop down option. Print true if "Appliances" is an option. Print false otherwise.
//    BONUS: Assert if the dropdown is in Alphabetical Order
 */
    @Test
    public void amazonWebDropDownTest(){
        WebElement searchDropdownBoxEl = driver.findElement(searchDropdownBoxBy);
        Select optionsSearchDropDown = new Select(searchDropdownBoxEl);
        //Print the first selected option and assert if it equals "All Departments".
        // If it fails, then comment that code out and continue rest of the test case.
        WebElement selectedElement = optionsSearchDropDown.getFirstSelectedOption();
        System.out.println(selectedElement.getText());
        Assert.assertTrue(selectedElement.getText().equals("All Departments"));
        //Select the 4th option by index (index of 3) and assert
        // if the name is "Amazon Devices".
        // (after you select you need to use get first selected option method).
        // If it fails, then comment that code out and continue rest of the test case.

        //fails
        //     WebElement fourthElement = optionsSearchDropDown.getOptions().get(3);
        //     Assert.assertTrue(selectedElement.getText().equals("Amazon Devices"));

        //    Print all of the dropdown options-getOptions();
        //    method returns the List<WebElement>. Using loop, print all options.
        List<WebElement> allOptions = optionsSearchDropDown.getOptions();
        allOptions.forEach(t-> System.out.println(t.getText()));
        //    Print the the total number of options in the dropdown
        System.out.println("Number of options:"+allOptions.size());
//    Assert if 'Appliances' is a drop down option.
//    Print true if "Appliances" is an option. Print false otherwise.
        boolean isAppliancesInOptions = allOptions.stream().anyMatch(t->t.getText().contains("Appliances"));
        System.out.println("Appliances is in the options:"+isAppliancesInOptions);
        List<String> unsortedOptionsTexts = new ArrayList<>();
        allOptions.forEach(t->unsortedOptionsTexts.add(t.getText()));
        List<String> sortedOptionsTexts = new ArrayList<>(unsortedOptionsTexts);
        Collections.sort(sortedOptionsTexts);
        if (unsortedOptionsTexts.equals(sortedOptionsTexts)){
            System.out.println("Options are sorted");
        }else{
            System.out.println("Options are not sorted");

        }

    }
    @After
    public void tearDown(){
        driver.quit();
    }

}