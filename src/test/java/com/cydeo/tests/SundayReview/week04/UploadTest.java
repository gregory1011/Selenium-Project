package com.cydeo.tests.SundayReview.week04;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadTest {

    @Test
    public void Test(){
        // TC: Guru99 Upload Test
        //1. Go to  “https://demo.guru99.com/test/upload”
        //2. Upload file into Choose File
        Driver.getDriver().get("https://demo.guru99.com/test/upload");
        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//input[@id='uploadfile_0']"));
        chooseFile.sendKeys("/Users/grigorerosca/Downloads/some-file (1).txt");

        //3. Click terms of service check box
        WebElement checkBox = Driver.getDriver().findElement(By.xpath("//input[@id='terms']"));

        //4. Click Submit File button
        WebElement submitBtn = Driver.getDriver().findElement(By.xpath("//button[@id='submitbutton']"));
        submitBtn.click();

        BrowserUtils.sleep(10);

        //5. Verify expected message appeared.
        // Expected: “1 file has been successfully uploaded.“
        String expectedMsg = "1 file\nhas been successfully uploaded.";
        WebElement message = Driver.getDriver().findElement(By.xpath("//div/h3/center"));
        String actualMSG = message.getText();

        Assert.assertEquals(actualMSG, expectedMsg, "Result msg verification failed!");





    }




}
