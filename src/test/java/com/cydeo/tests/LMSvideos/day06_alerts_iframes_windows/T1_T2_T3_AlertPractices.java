package com.cydeo.tests.LMSvideos.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_T2_T3_AlertPractices {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Go to website: https://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/javascript_alerts");


    }

    @Test
    public void T1(){
        // TC #1: Information alert practice
        //3. Click to “Click for JS Alert” button
         WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        informationAlertButton.click();

        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultText.isSelected(), "Result is not displayed");

        String actualText = resultText.getText();
        String expectedText = "You successfully clicked an alert";

        Assert.assertEquals(actualText, expectedText, "Actual text is not as expected");


    }

    @Test
    public void T2(){
        // TC #2: Confirmation alert practice
        //3. Click to “Click for JS Confirm” button
        WebElement confirmationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        confirmationAlertButton.click();

        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //5. Verify “You clicked: Ok” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultText.isDisplayed(), "Actual text is not as expected line 68 ");

    }

    @Test
    public void T3(){
        // TC #3: Information alert practice
        //3. Click to “Click for JS Prompt” button
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        informationAlertButton.click();

        //4. Send “hello” text to alert
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");

        //5. Click to OK button from the alert
      //  WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //6. Verify “You entered: hello” text is displayed.
       // String actualText = resultText.getText();
        String expectedText = "You entered: hello";



    }

    @AfterMethod
    public void teardownMethod(){
        driver.quit();
    }

}
