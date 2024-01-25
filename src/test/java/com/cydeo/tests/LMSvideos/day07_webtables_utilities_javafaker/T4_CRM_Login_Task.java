package com.cydeo.tests.LMSvideos.day07_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T4_CRM_Login_Task {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //TC #4: Login scenario
        //1. Create new test and make set up
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Go to: http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

    }

    @Test
    public void test1_CRM_login(){

     //   3. Enter valid username
        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("helpdesck1@cydeo.com");

     //   4. Enter valid password
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        //   5. Click to `Log In` button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBtn.click();

        //6. Verify title is as expected:
        //Expected: Portal

        BrowserUtils.sleep(5);
        BrowserUtils.verifyTitle(driver, "(2) Portal");


    }


    @Test
    public void test2_CRM_login(){

        // logging in using utilities method we created in CRM_Utilities class
        CRM_Utilities.login_CRM(driver, "helpdesck1@cydeo.com", "UserUser");


        //6. Verify title is as expected:
        //Expected: Portal

        BrowserUtils.sleep(5);
        BrowserUtils.verifyTitle(driver, "(2) Portal");


    }



    @AfterMethod
    public void tearDownMethod(){
        //driver.quit();
    }



}
