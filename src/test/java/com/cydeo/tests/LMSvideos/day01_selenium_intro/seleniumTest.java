package com.cydeo.tests.LMSvideos.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest {

    public static void main(String[] args) {


        WebDriverManager.chromiumdriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");





    }
}
