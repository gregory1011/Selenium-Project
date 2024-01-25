package com.cydeo.tests.SundayReview.week03;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframePractice extends TestBase {

     // TC : Iframe practice

    @Test
    public void sendingMessageIframeTest(){

        // 1. Users are already login and on the homepage of CRM app
        driver.get(ConfigurationReader.getProperty("env"));

        CRM_Utilities.login_CRM(driver, ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password"));


        // 2. Users click the MESSAGE tab
        driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-message']")).click();


        // 3. Users write test message
       // driver.switchTo().frame(0);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.bx-editor-iframe")));
        WebElement msgFrame = driver.findElement(By.tagName("body"));
        msgFrame.sendKeys("Hello People");

        // 4. Users click the SEND button
      //  driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector("button#blog-submit-button-save")).click();


        // 5. Verify the message is displayed on the feed
        WebElement feedMsg = driver.findElement(By.xpath("//div[contains(@id, 'blog_post_body')]"));

        String actualMsg = feedMsg.getText();
        String expectedMsg = "Hello People";

        Assert.assertEquals(actualMsg, expectedMsg);




    }


}
