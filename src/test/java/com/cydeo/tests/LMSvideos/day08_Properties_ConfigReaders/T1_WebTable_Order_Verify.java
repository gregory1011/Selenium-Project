package com.cydeo.tests.LMSvideos.day08_Properties_ConfigReaders;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebOrderUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_WebTable_Order_Verify {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        //1. Create new test and make set up
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");

    }

    @Test
    public void orderVerifyNameTest (){

        //2. Verify Bob’s name is listed as expected.
        String locator = "//table[@class='SampleTable']/tbody/tr[7]/td[.='Bob Martin']";
        WebElement bobCell = driver.findElement(By.xpath(locator));
        System.out.println("bobCell = " + bobCell.getText());

        //Expected: “Bob Martin”
        String actualName = bobCell.getText();
        String expectedName = "Bob Martin";

        Assert.assertTrue(actualName.equals(expectedName));

        //3. Verify Bob Martin’s order date is as expected
        WebElement bobsDOB = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[7]//td[.='Bob Martin']/../td[5]"));

        //Expected: 12/31/2021
        String actualDate = bobsDOB.getText();
        String expectedDate = "12/31/2021";

        Assert.assertTrue(actualDate.equals(expectedDate));

    }

    @Test
    public void test2_use_order_verify_Method(){

      String alexandraGray =  WebOrderUtils.returnOrderDate(driver,"Alexandra Gray");
        System.out.println("Alexandra Gray order's date: "+alexandraGray);

        String johnDoe =  WebOrderUtils.returnOrderDate(driver,"John Doe");
        System.out.println("John Doe order's date: "+johnDoe);

    }


    @Test
    public void test3(){

        WebOrderUtils.orderVerify(driver, "Samuel Jackson", "12/21/2021");



    }


    @AfterMethod
    public void tearDownMethod ( ) {
        driver.quit();
    }

}
