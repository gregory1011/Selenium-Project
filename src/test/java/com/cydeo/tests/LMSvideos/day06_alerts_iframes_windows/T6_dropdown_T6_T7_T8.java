package com.cydeo.tests.LMSvideos.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T6_dropdown_T6_T7_T8 {


    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void dropdown_Task6(){

        // TC #6: Selecting date on dropdown and verifying

        //3. Select “December 1st, 1933” and verify it is selected

        // Locate dropdown and pass them in Selected object constructor
        Select yearDropDown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropDown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropDown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //Select year using : visible text
        yearDropDown.selectByVisibleText("1993");

        //Select month using : value attribute
        monthDropDown.selectByVisibleText("December");

        //Select day using : index number
        dayDropDown.selectByIndex(0);


        // create expected value
        String expectedYear = "1993";
        String expectedMonth = "December";
        String expectedDay = "1";

        // get actual values from browser
        String actualYear = yearDropDown.getFirstSelectedOption().getText();
        String actualMonth = monthDropDown.getFirstSelectedOption().getText();
        String actualDay = dayDropDown.getFirstSelectedOption().getText();

        //create assertion

        Assert.assertTrue(actualYear.equals( expectedYear) );
        Assert.assertEquals(actualMonth, expectedMonth);
        Assert.assertEquals(actualDay, expectedDay, "Actual day is not as expected");


    }

    @Test
    public void dropdown_Task7(){
        // TC #7: Selecting state from State dropdown and verifying result

        // locate dropdown and create select object
        Select selectStateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. Select Illinois ByText
        selectStateDropdown.selectByVisibleText("Illinois");

        //4. Select Virginia ByValue
        selectStateDropdown.selectByValue("VA");

        //5. Select California  ByIndex
        selectStateDropdown.selectByIndex(5);

        //6. Verify final selected option is California.

        String expectedOptionText = "California";
        String actualOptionText = selectStateDropdown.getFirstSelectedOption().getText();

        // assertion
        Assert.assertEquals(actualOptionText, expectedOptionText, "Actual dropdown is not as expected");


    }


    @Test
    public void dropdown_Task8(){
        // TC #8: Selecting value from non-select dropdown

        //3. Click to non-select dropdown
        // locate the non-select dropdown
        WebElement websiteDropdown = driver.findElement(By.linkText("Dropdown link"));
        websiteDropdown.click();

        //4. Select Facebook from dropdown
        WebElement facebookLink = driver.findElement(By.linkText("Facebook"));
        facebookLink.click();

        //5. Verify title is “Facebook - Log In or Sign Up”
        String actualTitle = driver.getTitle();
        String expectedTitle ="Facebook - log in or sign up";

        Assert.assertEquals(actualTitle, expectedTitle, "Actual title is not as expected");




    }

    @AfterMethod
    public void tearDropdownMethod(){

      //  driver.quit();

    }

}
