package com.cydeo.tests.SundayReview.week03;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertsPractice extends TestBase {


    public WebDriver driver;


    @Test
    public void prompt_alert_test(){
        // 2. Go to website: https://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/javascript_alerts");

        // 3. Click to “Click for JS Prompt” button
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

        Alert alert = driver.switchTo().alert();

        // get text or alert window
        System.out.println("alert.getText() = " + alert.getText());

        BrowserUtils.sleep(3);

        // 4. Send “hello” text to alert
        alert.sendKeys("hello");

        // 5. Click to OK button from the alert
        alert.accept();

        // 6. Verify “You entered: hello” text is displayed.
        WebElement resultText = driver.findElement(By.id("result"));

        String actualText = resultText.getText();
        String expectedText = "You entered: hello";

       // Assert.assertEquals(resultText.isDisplayed());





    }





}
