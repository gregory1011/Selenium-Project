package com.cydeo.tests.LMSvideos.day09_review_javafaker_driverUtils;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_Bing_Search {

    WebDriver driver;

    @BeforeMethod
    public  void setupMethod(){
        //TC #1: Bing search
        //1- Open a Chrome browser
        driver = WebDriverFactory.getDriver( ConfigurationReader.getProperty("browser") );
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2- Go to: https://bing.com
        driver.get(ConfigurationReader.getProperty("bingURL"));
    }


    @Test
    public void test1(){

        //3- Write “apple” in search box
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='sb_form_q']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("searchWord")+ Keys.ENTER);

        //4- Verify title:
        //Expected: apple - Search
        String actualTitle = driver.getTitle();
        String expectedTitle = ConfigurationReader.getProperty("searchWord")+" - Search";

        Assert.assertEquals(actualTitle, expectedTitle);


    }



}
