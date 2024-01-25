package com.cydeo.tests.LMSvideos.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP3_GoogleXpathCss {
    public static void main(String[] args) {

        //TC #3: Back and forth navigation
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Click to Gmail from top right.
        //WebElement gmailLink = driver.findElement(By.xpath("//a[href='https://mail.google.com/mail/?authuser=0&amp;ogbl']"));
       // WebElement gmailLink = driver.findElement(By.xpath("a[text()='Gmail']"));

        // by cssSelector
        WebElement gmailLink = driver.findElement(By.cssSelector("a[href='https://mail.google.com/mail/?authuser=0&amp;ogbl']"));

        //4- Verify title contains:
        //Expected: Gmail


        //5- Go back to Google by using the .back();
        driver.navigate().back();



        //6- Verify title equals:
        //Expected: Google
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed");
        }else{
            System.err.println("Title verification failed");
        }

        driver.quit();


    }
}
