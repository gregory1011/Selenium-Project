package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    // Create a private constructor

    private Driver (){}

    // we make webDriver private because we want to close access to the object from the outside the class
    // we are making it static , because we will use it in a static method
    private static WebDriver driver; // default value is = null

    // Create a re-usable method which will return the same driver instance once we call it.
    // if an instance doesn't exist, it will create 1st, and then it will always return same instance.

    public  static WebDriver getDriver(){

        if ( driver == null ){
            //we will read the browserType from configuration properties file
            //this way, we can control which browser is opened from outside our code
           String browserType = ConfigurationReader.getProperty("browser");


           // depending on browserType returned from the configuration.properties
            // switch case will determine the 'case' and open the matching browser.
           switch ( browserType){
               case "chrome":
                   WebDriverManager.chromedriver().setup();
                   driver = new ChromeDriver();
                   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                   break;
               case "safari":
                  WebDriverManager.safaridriver().setup();
                  driver = new SafariDriver();
                  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                  break;
           }
        }
        return driver;
    }


    // create a new Driver.closeDriver(); it will .quite() method to quite browser,
    // and then set the driver value back to null
    public static void closeDriver(){
        if ( driver != null ){
            // this line will terminate the currently existing driver completely. It will not exist going forward
            driver.quit();
            // this will assign the value back to 'null' so that my 'singleton' can create a newer one if needed
            driver = null;
        }
    }





}
