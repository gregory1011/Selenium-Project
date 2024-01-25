package com.cydeo.tests.LMSvideos.day08_Properties_ConfigReaders;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T4_useConfigReader {

    //TC #4: Google search
    //Use `configuration.properties` for the following:
    //1. The browser type
    //2. The URL
    //3. The search keyword
    //4. Make title verification dynamic. If search value changes, title
    //assertion should not fail.

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        //1. Create new test and make set up
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Go to: https://google.com
        driver.get(ConfigurationReader.getProperty("googleURL"));
    }


    @Test
    public void googleSearchTest(){

        //3- Write in search box
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);


        //4- Verify title:
        //Expected: apple - Google Search
        String expectedTitle = ConfigurationReader.getProperty("searchValue")+" - Google Search";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);


    }


    @AfterMethod
    public void tearDownMethod() {
        driver.quit();
    }


}
