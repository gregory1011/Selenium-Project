package com.cydeo.tests.LMSvideos.day10_Upload_Actions_JSexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_UploadPractice {

    @Test
    public void test(){
        //1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        //2. Find some small file from your computer, and get the path of it.
        String path = "/Users/grigorerosca/Desktop/15/file.txt";

        //3. Upload the file. Use sendKeys() method
        WebElement choseFileBtn = Driver.getDriver().findElement(By.id("file-upload"));
        choseFileBtn.sendKeys("/Users/grigorerosca/Desktop/15/file.txt");

        WebElement uploadBtn = Driver.getDriver().findElement(By.id("file-submit"));
        uploadBtn.click();

        //4. Assert:
        //-File uploaded text is displayed on the page
        WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadedHeader.isDisplayed(), "Header text is NOT displayed");



    }
}
