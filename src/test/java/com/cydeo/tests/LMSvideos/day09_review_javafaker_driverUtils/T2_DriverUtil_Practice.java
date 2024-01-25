package com.cydeo.tests.LMSvideos.day09_review_javafaker_driverUtils;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class T2_DriverUtil_Practice {

//    WebDriver driver;
//
//    @BeforeMethod
//    public  void setupMethod(){
//        //TC #1: Bing search
//        //1- Open a Chrome browser
//        driver = WebDriverFactory.getDriver( ConfigurationReader.getProperty("browser") );
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//    }

    @Test
    public void test1(){

        // Driver.getDriver() ==> will return me the 'driver'
        // instead of writing 'driver' fromm now on we will write Driver.getDriver()

        //2- Go to: https://bing.com
        Driver.getDriver().get(ConfigurationReader.getProperty("bingURL"));

        //3- Write “apple” in search box
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//textarea[@id='sb_form_q']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("searchWord")+ Keys.ENTER);

        //4- Verify title:
        //Expected: apple - Search
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = ConfigurationReader.getProperty("searchWord")+" - Search";

        Assert.assertEquals(actualTitle, expectedTitle);


    }

    @Test
    public void test2(){

        // Driver.getDriver() ==> will return me the 'driver'
        // instead of writing 'driver' fromm now on we will write Driver.getDriver()

        //2- Go to: https://bing.com
        Driver.getDriver().get(ConfigurationReader.getProperty("bingURL"));

        //3- Write “apple” in search box
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//textarea[@id='sb_form_q']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("searchWord")+ Keys.ENTER);

        //4- Verify title:
        //Expected: apple - Search
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = ConfigurationReader.getProperty("searchWord")+" - Search";

        Assert.assertEquals(actualTitle, expectedTitle);


    }


    @AfterMethod

    public void tearDown(){
        // we won't use the selenium's quite method directly anymore.
        //Driver.getDriver().quit(); --> no longer will be using this method
        // we will use --> Driver.closeDriver();
        Driver.closeDriver();

    }
}
