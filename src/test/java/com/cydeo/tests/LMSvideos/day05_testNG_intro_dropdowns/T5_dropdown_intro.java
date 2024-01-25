package com.cydeo.tests.LMSvideos.day05_testNG_intro_dropdowns;

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


public class T5_dropdown_intro {


    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){

        //TC#5: Verifying “Simple dropdown” and “State selection” dropdown
        //default values
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }
    @AfterMethod
        public void tearDownMethod(){
        driver.quit();
    }

    @Test
    public  void  simpleDropdownTest(){

        //3. Verify “Simple dropdown” default selected value is correct

        //locating dropdown as a web element
        WebElement simpleDropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));

        Select select = new Select(simpleDropdown); // creating Select class object and passing dropdown webElement into constructor


        //Expected: “Please select an option”
        String expectedDefaultValue = "Please select an option";

        // Actual result
        String actualDefaultValue = select.getFirstSelectedOption().getText();

        // assortion
        Assert.assertEquals(actualDefaultValue, expectedDefaultValue);
        Assert.assertTrue(actualDefaultValue.equals(expectedDefaultValue));

        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”

        // create Select object , and locate the dropdown itself in my constructor
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String  expectedDefaultStateValue = "Select a State";
        String actualDefaultStateValue = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualDefaultStateValue, expectedDefaultStateValue);

    }
}
