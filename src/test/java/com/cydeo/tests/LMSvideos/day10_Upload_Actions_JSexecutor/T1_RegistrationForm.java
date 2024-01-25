package com.cydeo.tests.LMSvideos.day10_Upload_Actions_JSexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_RegistrationForm {


    @Test
    public void test(){

        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form
      //  Driver.getDriver() --> will return "driver"
        Driver.getDriver().get(ConfigurationReader.getProperty("registrationFormURl"));

        //3. Enter first name
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys("Jane");

        //4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys("Braveman");

        //5. Enter username
        WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        inputUsername.sendKeys("JaneBraveman1102");

        //6. Enter email address
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys("jane.robots@gmail.com");

        //7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys("Jane1010BraveMan");


        //8. Enter phone number
        WebElement inputPhoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhoneNumber.sendKeys("617-409-3087");


        //9. Select a gender from radio buttons
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();


        //10.Enter date of birth
        WebElement inputDOB = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        inputDOB.sendKeys("6/19/2023");


        //11.Select Department/Office
        Select selectDepartment = new Select(Driver.getDriver().findElement(By.name("department")));
        selectDepartment.selectByValue("DE");

        //12.Select Job Title
        Select selectJobTitle = new Select(Driver.getDriver().findElement(By.name("job_title")));
        selectJobTitle.selectByVisibleText("SDET");


        //13.Select programming language from checkboxes
        WebElement programmingLanguage = Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox2']"));
        programmingLanguage.click();


        //14.Click to sign up button
        WebElement signUpBtn = Driver.getDriver().findElement(By.id("wooden_spoon"));
        signUpBtn.click();


        //15.Verify success message “You’ve successfully completed registration.” is
        //displayed.

        String expectedMsg = "You’ve successfully completed registration!";
        WebElement Msg = Driver.getDriver().findElement(By.xpath("//div//p"));
        String actualMsg = Msg.getText();

      // Assert.assertTrue(actualMsg.equals(expectedMsg));
        Assert.assertTrue(Msg.isDisplayed());

    }
}
