package com.cydeo.tests.LMSvideos.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP4_xpathLocator {
    public static void main(String[] args) {

        //HWP #4: Practice Cydeo – xpath locator practice
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

        //3- Click to “Home” link
        //PS: Locate “Home” link using “xpath” locator
        WebElement homeLink = driver.findElement(By.xpath("//a[text()='Home']"));
        homeLink.click();

        //4- Verify title is as expected:
        //Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Pass");
        }else {
            System.err.println("Fail");
        }
        driver.close();



    }
}
