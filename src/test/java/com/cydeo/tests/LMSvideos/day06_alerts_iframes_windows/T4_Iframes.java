package com.cydeo.tests.LMSvideos.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T4_Iframes {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Go to website: https://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/iframe");


    }


    @Test
    public void iframeTest(){
        // TC #4: Iframe practice
        // we have to switch to iframe to be able to locate web element in here

        // option1 = switch "id" attribute value
       // driver.switchTo().frame("mce_0_ifr");

        // option1 = switch "index" number
        // driver.switchTo().frame(0);

        // option1 = switch web element
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        WebElement paragraphText = driver.findElement(By.xpath("//p[.='Your content goes here.']"));

        //4. Assert: “Your content goes here.” Text is displayed.
        Assert.assertTrue(paragraphText.isDisplayed());

        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        driver.switchTo().parentFrame();

        WebElement h3 = driver.findElement(By.tagName("h3"));

        Assert.assertTrue(h3.isDisplayed());


    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }




}
