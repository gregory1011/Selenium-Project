package com.cydeo.tests.LMSvideos.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locator_getText {
    public static void main(String[] args) {

        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("safari");

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        WebElement locateUsername = driver.findElement(By.className("login-inp"));
        locateUsername.sendKeys("incorrect");

        //4- Enter incorrect password: “incorrect”
        WebElement locatePassword = driver.findElement(By.name("USER_PASSWORD"));
        locateUsername.sendKeys("incorrect");

        //5- Click to log-in button.
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password

        String expectedErrorText = "Incorrect login or password";
        String actualErrorText = driver.findElement(By.className("errortext")).getText();

        if (actualErrorText.equals(expectedErrorText)){
            System.out.println("Error text verification passed");
        }else{
            System.out.println("Error text verification fail");

        }





        //PS: Inspect and decide which locator you should be using to locate web




    }
}
