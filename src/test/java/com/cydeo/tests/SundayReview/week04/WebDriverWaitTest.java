package com.cydeo.tests.SundayReview.week04;

import com.cydeo.pages.WebDriverWaitPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebDriverWaitTest {


    @Test
    public void Test () {
        // TC: WebdriverWait practice
        // 1. Go to https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

       // 2. Click to start
        WebDriverWaitPage webDriverWaitPage = new WebDriverWaitPage();
        webDriverWaitPage.startBtn.click();

       // 3. Wait until loading bar disappears
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(webDriverWaitPage.loadingBar));


       // 4. Assert username inputbox is displayed
        Assert.assertTrue(webDriverWaitPage.username.isDisplayed());


       // 5. Enter username: tomsmith
       // webDriverWaitPage.username.sendKeys("tomsmith");

       // 6. Enter password: incorrectpassword
      //  webDriverWaitPage.password.sendKeys("incorrectpassword");

       // 7. Click to Submit button
       // 8. Assert “Your password is invalid!” text is displayed.
    }


}
