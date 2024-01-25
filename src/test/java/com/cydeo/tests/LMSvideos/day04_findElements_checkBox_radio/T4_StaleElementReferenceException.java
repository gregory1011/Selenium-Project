package com.cydeo.tests.LMSvideos.day04_findElements_checkBox_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T4_StaleElementReferenceException {
    public static void main(String[] args) {

        //TC #4: StaleElementReferenceException Task
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate “CYDEO” link, verify it is displayed.
        WebElement locateCydeoLink = driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));
        System.out.println("locateCydeoLink.isDisplayed() = " + locateCydeoLink.isDisplayed());

        //4- Refresh the page.
        driver.navigate().refresh();
        System.out.println("refreshing the page");

        //5- Verify it is displayed, again.
        locateCydeoLink = driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));

        System.out.println("locateCydeoLink.isDisplayed() = " + locateCydeoLink.isDisplayed());

        //-------------------------

        driver.navigate().refresh();
        System.out.println("refreshing the page");
        locateCydeoLink = driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));

        System.out.println("locateCydeoLink.isDisplayed() = " + locateCydeoLink.isDisplayed());





        //This is a simple StaleElementReferenceException to understand what is
        //this exception and how to handle it.



    }
}
