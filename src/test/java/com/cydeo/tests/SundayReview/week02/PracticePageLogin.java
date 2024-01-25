package com.cydeo.tests.SundayReview.week02;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticePageLogin {
    public static void main(String[] args) {

       WebDriver driver =  WebDriverFactory.getDriver("chrome");

        // 2 got to: https://practice.cydeo.com/login
        driver.get("https://practice.cydeo.com/login");

        //3 enter username: "tomsmith"
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("tomsmith");

        // 4. Enter password: "SuperSecretPassword"
        WebElement password = driver.findElement(By.xpath("//input[@name='password'] "));
        password.sendKeys("SuperSecretPassword");

        // 5. click to login button
        WebElement loginBtn = driver.findElement(By.xpath("//button[.='Login']"));
        loginBtn.click();

        // 6. verification text displayed on page
        // expected: "You logged into a secure area!"

        WebElement result = driver.findElement(By.xpath("//div[normalize-space(text())='You logged into a secure area!']"));

        String actualText = driver.getTitle();
        String expectedText = "You logged into a secure area!";

                if(actualText.contains(expectedText)){
                    System.out.println("Verification pass");
                }else{
                    System.err.println("Verification fail");
                }

                driver.close();






    }
}
