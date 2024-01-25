package com.cydeo.tests.LMSvideos.day02_locator_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class t3_googleSearch {
    public static void main(String[] args) {

        //TC#3: Google search
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://www.google.com/");

        //3- Write “apple” in search box
        // Locate search box . Enter "Key"
        WebElement googleSearchBox = driver.findElement(By.name("q"));

        // . Enter "apple" key
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);

        //4- Press ENTER to search
       // googleSearchBox.sendKeys(Keys.ENTER);

        //5- Verify title:
        //Expected: Title should start with “apple” word

        String expectedInBeginningOfTitle = "apple";
        String actualTitle = driver.getTitle();

        if ( actualTitle.startsWith(expectedInBeginningOfTitle)){
            System.out.println("Title verification PASS.");
        }else {
            System.out.println("Title verification Failed");
        }
    }
}
