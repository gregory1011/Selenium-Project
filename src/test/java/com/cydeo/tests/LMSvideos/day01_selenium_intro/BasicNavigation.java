package com.cydeo.tests.LMSvideos.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.tesla.com");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        driver.navigate().to("https://www.google.com");

        System.out.println("driver.getTitle() = " + driver.getTitle()); // GOOGLE

        driver.navigate().to("https://www.amazon.com");

        String title = driver.getTitle();
        System.out.println("title = " + title);  // Amazon

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.close();

        driver.quit();

    }
}
