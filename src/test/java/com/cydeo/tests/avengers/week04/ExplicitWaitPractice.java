package com.cydeo.tests.avengers.week04;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWaitPractice extends TestBase {

    @Test
    public void explicitWaitPractice() {

        //Go to "https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html"
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        //Click buttons in order
        WebElement startBtn = driver.findElement(By.id("button00"));
        System.out.println(startBtn.isEnabled());

        WebElement oneBtn = driver.findElement(By.id("button01"));
        System.out.println(oneBtn.isEnabled());

        WebElement twoBtn = driver.findElement(By.id("button02"));
        System.out.println(twoBtn.isEnabled());

        WebElement threeBtn = driver.findElement(By.id("button03"));
        System.out.println(threeBtn.isEnabled());

        // click start button
        startBtn.click();

        // click one button
        wait.until(ExpectedConditions.elementToBeClickable(oneBtn));
        oneBtn.click();


        // click two button
        wait.until(ExpectedConditions.elementToBeClickable(twoBtn));
        twoBtn.click();

        // click three button
        BrowserUtils.waitforClickablility(driver, threeBtn);
        threeBtn.click();



        //       Verify messages are equal after click all buttons
        WebElement text = driver.findElement(By.id("buttonmessage"));

        // All Buttons Clicked
        String expectedText = "All Buttons Clicked";
        String actualResult = text.getText();

        Assert.assertEquals(actualResult, expectedText);

        //  Clickable Buttons
        expectedText ="Clickable Buttons";
        wait.until(ExpectedConditions.textToBe(By.id("buttonmessage"), expectedText));
        actualResult = text.getText();

        Assert.assertEquals(actualResult, expectedText);

        //  Click Buttons In Order
        expectedText = "Click Buttons In Order";
        wait.until(ExpectedConditions.textToBePresentInElement(text, expectedText));
        actualResult = text.getText();
        Assert.assertEquals(actualResult, expectedText);




    }


}
