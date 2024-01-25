package com.cydeo.tests.LMSvideos.day02_locator_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP3_GmailPracticeVerification {

    public static void main(String[] args) {


        // Uefa Champions League
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.uefa.com/");

        //locate Uefa Champions League

        WebElement linkUCL = driver.findElement(By.linkText("UEFA Champions League"));

        // click on UCL
        linkUCL.click();

        // verify title contains: UEFA

        String expectedUefaTitle = "UEFA";
        String actualUefaTitle = driver.getTitle();

        if (actualUefaTitle.contains(expectedUefaTitle)){
            System.out.println("Verification passed");
        }else{
            System.err.println("Verification failed");
        }

        // go back to home page

        driver.navigate().back();

        // verify title equals . expected UEFA

        String expectedTitle = "UEFA";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Verification passed");
        }else{
            System.err.println("Verification failed");
        }

        driver.quit();



    }
}
