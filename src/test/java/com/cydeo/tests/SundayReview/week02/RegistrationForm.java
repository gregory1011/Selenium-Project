package com.cydeo.tests.SundayReview.week02;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegistrationForm {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        // // 1. Open Chrome browser
        driver =  WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //    // 2. Go to https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

    }

    @Test( priority = 1 )
    public void registrationFormPage(){

//        // // 1. Open Chrome browser
//        WebDriver driver =  WebDriverFactory.getDriver("chrome");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        //    // 2. Go to https://practice.cydeo.com/registration_form
//        driver.get("https://practice.cydeo.com/registration_form");

        // 3. Verify title is as expected:
        // Expected: "Registration Form"

        String actualTitle = driver.getTitle();
        String expectedTitle = "Registration Form";

        Assert.assertEquals(actualTitle, expectedTitle);


    }

    @Test ( priority = 2 )
    public void registrationFillingOutTest(){

        // 3. Enter First name: "John"
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("John");

        // 4. Enter Last name: "Smith"
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Smith");

        // 5. Enter Username: "johnsmith123"
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("johnsmith123");

        // 6. Enter Email address: "john.smith@email.com"
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("john.smith@email.com");

        // 7. Enter password: "John1234"
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("John1234");

        // 8. Enter Phone number: "123-456-7890"
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys("123-456-7890");

        // 9. Click to "Male" from Gender
        WebElement genderMale = driver.findElement(By.xpath("//input[@value='male']"));
        genderMale.click();

        Assert.assertTrue(genderMale.isSelected());

        // 10. Enter Date of birth "01/28/1990"
        WebElement dateBirth = driver.findElement(By.xpath("//input[@name='birthday']"));
        dateBirth.sendKeys("01/28/1990");

        // 11. Select "Department of Engineering" from Department/Office dropdown
        WebElement departmentEngineering = driver.findElement(By.xpath("//option[@value='DE']"));
        departmentEngineering.click();

        Assert.assertTrue(departmentEngineering.isSelected());

        // 12. Select "SDET" from Job title dropdown
        WebElement selectSDET = driver.findElement(By.xpath("//option[.='SDET']"));
        selectSDET.click();

        Assert.assertTrue(selectSDET.isSelected());

        // 13. Click to "Java" from languages
        WebElement javaButton = driver.findElement(By.xpath("//input[@id='inlineCheckbox2']"));
        javaButton.click();

        Assert.assertTrue(javaButton.isSelected());

        // 14. Click to "Sign up" button
        WebElement signupButton = driver.findElement(By.xpath("//button[.='Sign up']"));
        signupButton.click();



        // 15. Verify text displayed on page
        //     Expected: "Well done!"
        WebElement textVerification = driver.findElement(By.xpath("//h4[.='Well done!']"));
        String actualTestDisplayed = textVerification.getText();
        String expectedTextDisplayed = "Well done!";

        Assert.assertEquals(actualTestDisplayed, expectedTextDisplayed);


    }

    @AfterMethod
    public void tearDownMethod(){

         driver.close();

    }


}
