package com.cydeo.tests.WednesdayReview.week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VyTrackLoginPAge {

    public static void main(String[] args) {

        //TC001 As a user I should be able to see Login label is displayed
        //  1-open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //  2-goto https://vytrack.com/
        driver.get("https://vytrack.com/");

        //  3-verify Login is displayed

        WebElement loginLink = driver.findElement(By.linkText("LOGIN"));

        String actualText = loginLink.getText();
        String expectedText = "LOGIN";

        Assert.assertEquals(actualText, expectedText);





    }

}
