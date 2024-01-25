package com.cydeo.tests.LMSvideos.day02_locator_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoVerification {

    public static void main(String[] args) {

        // TC #1: Cydeo practice tool verifications
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com
        //3. Verify URL contains
        //Expected: cydeo
        //4. Verify title:
        //Expected: Practice

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com");
        driver.manage().window().maximize();

        String expectedInURL ="cydeo";
        String actualURL = driver.getCurrentUrl();

        if ( actualURL.contains(expectedInURL)){
            System.out.println("Url verification Passed.");
        }else{
            System.out.println("Url verification Failed");
        }

        String expectedTitle ="Practice";
        String actualTitle = driver.getTitle();
        if ( actualTitle.contains(expectedTitle)){
            System.out.println("Title verification Passed.");
        }else{
            System.out.println("Title verification Failed");
        }

        // close the browser
        driver.close();





    }

}
