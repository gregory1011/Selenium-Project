package com.cydeo.tests.base;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class TestBase {
    // This class is abstract because we don't want to create any object from it

    // This class is the parent of all Test classes
    // You will update this class based on what you are keep writing in your most test classes
    // Instead writing in all test classes, you can just write in this class
    // and, you can extend this class to any class


    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        // open Chrome browser
        // Driver class will handle driver setting upi line of codes
        // Since we are using driver class, we will not use setting up browser drivers codes.

        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // After we create singleton Design patters in our project.
        // we will not need above codes instead we will determine common line of codes from most test
        // methods to implement in this class
        // we can use this class for navigating to the page.
       // driver.get("URL of app");
    }


    @AfterMethod
    public void tearDownMethod () {
        driver.quit();

       // Driver.closeDriver();
    }




}


