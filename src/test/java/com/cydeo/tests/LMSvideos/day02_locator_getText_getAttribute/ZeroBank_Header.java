package com.cydeo.tests.LMSvideos.day02_locator_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank_Header {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        // HWP #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html
         driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        WebElement headerText = driver.findElement(By.tagName("h3"));
        String expectedHeader = "Log in to ZeroBank";
        String actualHeader = headerText.getText();

        // Verification
        //Expected: “Log in to ZeroBank”

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Header text pass");
        }else{
            System.out.println("Header text fail");
        }

        // Verification
        //Expected: “Log in to ZeroBank”



    }
}
