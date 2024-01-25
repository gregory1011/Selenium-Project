package com.cydeo.tests.SundayReview.week03;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Hard_Soft_Assertion {

    WebDriver driver;

@BeforeMethod
    public void setupMethod(){
    // 1. Open Chrome browser
    driver = WebDriverFactory.getDriver("chrome");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    // 2. Go to https://practice.cydeo.com/login
    driver.get("https://practice.cydeo.com/login");


}

@Test
    public void loginTest_HardAssertion(){

    // 3. Enter username: "tomsmith"
    WebElement username = driver.findElement(By.name("username"));
    username.sendKeys("tomsmith");

    // 4. Enter password: "SuperSecretPassword"
    WebElement password = driver.findElement(By.name("password"));
    password.sendKeys("SuperSecretPassword");

    // 5. Click to Login button
    WebElement loginBtn = driver.findElement(By.id("wooden_spoon"));
    loginBtn.click();

    // 6. Verify text displayed on page
    Assert.assertTrue(driver.getTitle().equals("Secure Area"));

    //    Expected: "You logged into a secure area!"
    WebElement resultText = driver.findElement(By.xpath("//div[normalize-space(text()) ='You logged into a secure area!']"));
    String actualResultText = resultText.getText();
    String expectedResultText = "You logged into a secure area!";


    Assert.assertTrue(actualResultText.contains(expectedResultText));

}


    public void loginTest_SoftAssertion(){

        // 3. Enter username: "tomsmith"
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("tomsmith");

        // 4. Enter password: "SuperSecretPassword"
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword");

        // 5. Click to Login button
        WebElement loginBtn = driver.findElement(By.id("wooden_spoon"));
        loginBtn.click();

        SoftAssert softassert = new SoftAssert();
        softassert.assertTrue(driver.getTitle().equals("Secure Area"));



        // 6. Verify text displayed on page
        //    Expected: "You logged into a secure area!"
        WebElement resultText = driver.findElement(By.xpath("//div[normalize-space(text()) ='You logged into a secure area!']"));
        String actualResultText = resultText.getText();
        String expectedResultText = "You logged into a secure area!";


        Assert.assertTrue(actualResultText.contains(expectedResultText));

        softassert.assertAll();

    }
}
