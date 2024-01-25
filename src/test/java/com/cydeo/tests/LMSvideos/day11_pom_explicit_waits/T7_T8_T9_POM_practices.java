package com.cydeo.tests.LMSvideos.day11_pom_explicit_waits;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T7_T8_T9_POM_practices {

    LibraryLoginPage loginPage;


    @BeforeMethod
    public void setupMethod(){
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com");
        loginPage = new LibraryLoginPage();
    }

    @Test
    public void testT7(){
        // #7: Required field error message test
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com
        //3- Do not enter any information

        //4- Click to “Sign in” button
        loginPage.signInButton.click();

        //5- Verify expected error is displayed:
        Assert.assertTrue(loginPage.fieldRequiredErrorMessage.isDisplayed());

        //Expected: This field is required.
        //NOTE: FOLLOW POM DESIGN PATTERN
    }


    @Test
    public void testT8(){
        // #8: Invalid email format error message test
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com

        //3- Enter invalid email format
        loginPage.emailInput.sendKeys("username");
        loginPage.signInButton.click();

        //4- Verify expected error is displayed:
        Assert.assertTrue(loginPage.enterValidEmailErrorMessage.isDisplayed());

        //Expected: Please enter a valid email address.
        //NOTE: FOLLOW POM DESIGN PATTERN
    }

    @Test
    public void testT9(){
        // #9: Library negative login
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com
        //3- Enter incorrect username or incorrect password
        loginPage.emailInput.sendKeys("jora101010@gmail.com");
        loginPage.inputPassword.sendKeys("George33Hotel");
        loginPage.signInButton.click();

        //4- Verify title expected error is displayed:
        Assert.assertTrue(loginPage.wrongEmailOrPasswordMessage.isDisplayed());


        //Expected: Sorry, Wrong Email or Password
        //NOTE: FOLLOW POM DESIGN PATTERN
    }

    @AfterMethod
    public void tearDownMethod(){
        Driver.closeDriver();
    }
}
