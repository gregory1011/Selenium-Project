package com.cydeo.tests.WednesdayReview.week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class VyTrackLoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //TC002 As a user I should be able to see the login page
        // 1- Set up the "browser driver"
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2- Go to "https://vytrack.com/"
        driver.get("https://vytrack.com/");

    }

    @Test
    public void loginTest() throws InterruptedException {
        // 3- Click Login label
        WebElement loginLink = driver.findElement(By.linkText("LOGIN"));
        loginLink.click();

        // 3- Verify the title contains "Login"
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "Login";

        Assert.assertTrue(actualTitle.contains(expectedTitle));

        // 4- Login to application with username as "User1" and password as "UserUser123"
        WebElement username = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        username.sendKeys("User1");

        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123");

        WebElement loginBtn = driver.findElement(By.xpath("//button[@id='_submit']"));
        loginBtn.click();
        Thread.sleep(10000);

        // 5- Verify the title contains "Dashboard"
        String actualTitle1 = driver.getTitle();
        System.out.println(actualTitle1);
        String titleContains = "Dashboard";

        Assert.assertTrue(actualTitle1.contains(titleContains));








    }

    @AfterMethod
    public void tearDownMethod(){
       // driver.quit();
    }

}
