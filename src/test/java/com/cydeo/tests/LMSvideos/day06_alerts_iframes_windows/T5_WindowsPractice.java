package com.cydeo.tests.LMSvideos.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T5_WindowsPractice {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Go to website: https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void multiple_windowsTest(){
        // TC #5: Window Handle practice
        //4. Assert: Title is “Windows”
        String actualTitle = driver.getTitle();
        String expectedTitle ="Windows";

        Assert.assertEquals(actualTitle, expectedTitle);

        String mainHandle = driver.getWindowHandle();
        System.out.println("main handle: " +mainHandle);

        System.out.println("Title before click " + driver.getTitle());

        //5. Click to: “Click Here” link
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        System.out.println("Title after click " + driver.getTitle());

        //6. Switch to new Window. we need to use driver.getWindowsHandel() method
        // driver.getWindowsHandel();
        // 1 - windowHandle : mainHandle
        // 2 - windowHandle : 2nd windowHandle

        for (String each : driver.getWindowHandles()){

            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: "+ driver.getTitle());
        }


        //7. Assert: Title is “New Window”
        String expectedTitleAfterClick = "New Window";
        String actualTitleAfterClick = driver.getTitle();

        Assert.assertEquals(actualTitleAfterClick, expectedTitleAfterClick);

        // if we got to back to main page to continue our test case,
        // we can mainHandle to switch

        driver.switchTo().window(mainHandle);


    }

    @AfterMethod
    public void teardownMethod(){
         driver.quit();
    }
}
