package com.cydeo.tests.LMSvideos.day02_locator_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class libraryVerification {
    public static void main(String[] args) {

        //TC #4: Library verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://library2.cybertekschool.com/login.html
        driver.get("http://library2.cybertekschool.com/login.html");

        //3. Enter username: “incorrect@email.com”
        //   Locate username input box using “className” locator
        WebElement locateUsername = driver.findElement(By.className("form-control"));
        locateUsername.sendKeys("incorrect@email.com");

        //4. Enter password: “incorrect password”
        //Locate password input box using “id” locator
        WebElement locatePassword = driver.findElement(By.id("inputPassword"));
        locatePassword.sendKeys("Kool1203Hold");

        //5. Verify: visually “Sorry, Wrong Email or Password”
        //Locate Sign in button using “tagName” locator
        WebElement locateSignIn = driver.findElement(By.tagName("button"));
        locateSignIn.click();







    }
}
