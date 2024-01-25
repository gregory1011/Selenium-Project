package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {

public static WebDriver getDriver( String browserType) {
    // Task : new method creation
    // method name = getDriver

    if (browserType.equalsIgnoreCase("chrome")) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();

        return chrome;
    } else if (browserType.equalsIgnoreCase("safari")) {
        WebDriverManager.safaridriver().setup();
        WebDriver safari = new SafariDriver();
        safari.manage().window().maximize();
        return safari;
    } else {
        System.out.println("Given String doesn't represent any browser");
        System.out.println("Either that browser does not exist or not currently supported");
        System.out.println("driver = null");
        return null;
    }


    // static method
    // accepts String arg: browserType
    //   - This arg will determine what type of browser  is open
    //   - if "Chrome" passed --> it will open  Chrome browser
    //   - if "Safari" passed --> it will open  Safari browser
    // Return type: "WebDriver".


     }
}
