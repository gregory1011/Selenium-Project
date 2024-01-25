package com.cydeo.tests.SundayReview.week02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation_GetMethod {
    public static void main(String[] args) {

        // / TC#1: Navigations and Get methods Practice

       // WebDriverManager.chromedriver().setup();

        //      // 1. Open a Chrome browser
        WebDriver driver =  new ChromeDriver();

        //      // 2. Go to: https://www.etsy.com/
       driver.get("https://www.etsy.com/");

        //      // 3. Navigate to https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //      // 4. Navigate back, forward and refresh
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        //      // 5. Write “selenium” in search box

       WebElement searchBox =  driver.findElement(By.id("twotabsearchtextbox"));
       searchBox.sendKeys("selenium");


        //      // 6. Press search button to search
        WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        searchButton.click();

        //      // 7. Verify title is "Amazon.com : selenium"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon.com : selenium";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }

        //      // 8. Verify url contains "selenium"

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "selenium";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("URl verification pass");
        }else{
            System.out.println("URL verification fail");
        }

        driver.close();
    }
}
