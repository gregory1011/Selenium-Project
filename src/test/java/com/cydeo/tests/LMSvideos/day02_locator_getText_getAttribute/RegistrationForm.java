package com.cydeo.tests.LMSvideos.day02_locator_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {

    public static void main(String[] args) {

        //TC #5: getText() and getAttribute() method practice
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected:
        //Expected: Registration form
        WebElement header = driver.findElement(By.tagName("h2"));

        String expectedHeader = "Registration form";
        String actualHeader = header.getText();

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Verification Pass");
        }else{
            System.out.println("Verification Fail");
        }

        //4- Locate “First name” input box
        WebElement locateFirstName = driver.findElement(By.className("form-control"));

        //5- Verify placeholder attribute’s value is as expected:
        //Expected: first name
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = locateFirstName.getAttribute("placeholder");
        System.out.println("actualPlaceHolder = " + actualPlaceHolder);

        if (actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("PlaceHolder verification Pass");
        }else{
            System.out.println("PlaceHolder verification Fail");
        }




    }
}
