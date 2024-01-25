package com.cydeo.utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Set;

// This class will be storing only the utility methods that can be used across the project.
public class BrowserUtils {

    public static void sleep (int seconds){
        // this method will accept int - seconds
        // and execute Thread.sleep method for given duration
        seconds *= 1000;
        try{
            Thread.sleep(seconds);
        }catch (InterruptedException e){

        }
    }



    public  static void switchWindowAndVerify(
            WebDriver driver, String expectedInURL, String expectedInTitle){

        // 4. Create a logic to switch to the tab where Etsy.com is open
        Set<String> allWindowsHandles = driver.getWindowHandles();

        for (String each : allWindowsHandles){
            driver.switchTo().window(each);
            System.out.println("Get current URL: "+ driver.getCurrentUrl());

            if ( driver.getCurrentUrl().contains(expectedInURL)){
                break;
            }
        }


        // 5. Assert: Title contains requirements
        String actualTitle = driver.getTitle();

        Assert.assertTrue( actualTitle.contains(expectedInTitle) );

    }


    public static void verifyTitle(WebDriver driver, String expectedTitle){

        Assert.assertEquals(driver.getTitle(), expectedTitle);

    }



    public static void verifyTitleContains(WebDriver driver, String expectedTitle){

        Assert.assertTrue(driver.getTitle().contains(expectedTitle));

    }



    // this method accepts webElement target and waits for the webElement not to be displayed
    public static void waitForInvisibilityOF(WebElement target){

        // create object from WebDriverWai class and set up the constructor args.
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        // use the 'wait' object with the proper syntax to create explicit wait conditions.
        wait.until(ExpectedConditions.invisibilityOf(target));


    }



    // this method accepts String title and waits for the title to contain given String value
    public static void waitForTitleContains(String title){

        // create object from WebDriverWai class and set up the constructor args.
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        // use the 'wait' object with the proper syntax to create explicit wait conditions.
        wait.until(ExpectedConditions.titleContains(title));


    }


    public static WebElement waitforClickablility(WebDriver driver, WebElement element){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.elementToBeClickable(element));

    }

}
