package com.cydeo.tests.avengers.week04;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FakerPractice {

    @Test
    public void faker_test(){
        // Launch browser
        //Navigate to url 'https://automationexercise.com/login'
        Driver.getDriver().get("https://automationexercise.com/login");
        Faker faker = new Faker();

        //Verify 'New User Signup!' is visible
        WebElement newUserSignup = Driver.getDriver().findElement(By.xpath("//h2[.='New User Signup!']"));
        Assert.assertTrue(newUserSignup.isDisplayed());

        //Enter name and email address
        WebElement name = Driver.getDriver().findElement(By.xpath("//input[@name='name']"));
        name.sendKeys(faker.name().firstName());

        WebElement email = Driver.getDriver().findElement(By.xpath("//input[@data-qa='signup-email']"));
        email.sendKeys(faker.internet().emailAddress());

        //Click 'Signup' button
        WebElement signupBtn = Driver.getDriver().findElement(By.xpath("//button[.='Signup']"));
        signupBtn.click();

        //Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement header = Driver.getDriver().findElement(By.xpath("//h2[.='Enter Account Information']"));
        Assert.assertTrue(header.isDisplayed());

        //Fill details: Title, Name, Email, Password, Date of birth
        WebElement title = Driver.getDriver().findElement(By.xpath("//input[@value='Mr']"));

        WebElement password = Driver.getDriver().findElement(By.id("password"));
        password.sendKeys(faker.internet().password());

        Select selectDay = new Select(Driver.getDriver().findElement(By.id("days")));
        selectDay.selectByVisibleText("3");

        Select selectMonth = new Select(Driver.getDriver().findElement(By.id("months")));
        selectMonth.selectByValue("4");

        Select selectYear = new Select(Driver.getDriver().findElement(By.id("years")));
        selectYear.selectByVisibleText("2005");

        //Select checkbox 'Sign up for our newsletter!'
        Driver.getDriver().findElement(By.id("newsletter"));

        //Select checkbox 'Receive special offers from our partners!'
        Driver.getDriver().findElement(By.id("optin"));

        //Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        WebElement firstName = Driver.getDriver().findElement(By.id("first_name"));
        firstName.sendKeys(faker.name().firstName());

        WebElement lastName = Driver.getDriver().findElement(By.id("last_name"));
        lastName.sendKeys(faker.name().lastName());

        WebElement companyName = Driver.getDriver().findElement(By.id("company"));
        companyName.sendKeys(faker.company().name());

        WebElement address = Driver.getDriver().findElement(By.id("address1"));
        address.sendKeys(faker.address().streetAddress());

        WebElement address2 = Driver.getDriver().findElement(By.id("address2"));
        address2.sendKeys(faker.letterify("Unit 4"));

        Select selectCountry = new Select(Driver.getDriver().findElement(By.id("country")));
        selectCountry.selectByVisibleText("United States");

        WebElement state = Driver.getDriver().findElement(By.id("state"));
        state.sendKeys(faker.address().state());

        WebElement city = Driver.getDriver().findElement(By.id("city"));
        city.sendKeys(faker.address().city());

        WebElement zipcode = Driver.getDriver().findElement(By.id("zipcode"));
        zipcode.sendKeys(faker.address().zipCode());

        WebElement cellNumber = Driver.getDriver().findElement(By.id("mobile_number"));
        cellNumber.sendKeys(faker.phoneNumber().cellPhone());

        BrowserUtils.sleep(4);

        //Click 'Create Account button'
        WebElement createAccBtn = Driver.getDriver().findElement(By.xpath("//button[@data-qa='create-account']"));
      //  createAccBtn.click();









        //Verify that 'ACCOUNT CREATED!' is visible
        //Click 'Continue' button
        //Verify that 'Logged in as username' is visible
    }
}
