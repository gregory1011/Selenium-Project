package com.cydeo.tests.LMSvideos.day12_review;

import com.cydeo.pages.DynamicControlPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T2_T3_ExplicitWaitPractice {

    DynamicControlPage dynamicControlPage;


    @BeforeMethod
    public void setupMethod(){

        //1- Open a Chrome browser
        //2- Go to: https://practice.cydeo.com/dynamic_controls
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");

        dynamicControlPage = new DynamicControlPage();

    }


    @Test
    public void TestT2 (){
        //TC #2: Explicit wait practice

        //3- Click to “Remove” button
        dynamicControlPage.removeBtn.click();

        //4- Wait until “loading bar disappears”
        // create object from WebDriverWai class and set up the constructor args.
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        // use the 'wait' object with the proper syntax to create explicit wait conditions.
        wait.until(ExpectedConditions.invisibilityOf(dynamicControlPage.loadingBar));

        //5- Verify:
        //5.1. Checkbox is not displayed
        //dynamicControlPage.checkBox.isDisplayed() --> if displayed , return true

        //Assert.assertTrue( ! dynamicControlPage.checkBox.isDisplayed());
        // assert false expects to return a false condition to pass the test

        try {
            Assert.assertFalse(dynamicControlPage.checkBox.isDisplayed());
        }catch (NoSuchElementException n){
           // n.printStackTrace();
            System.out.println("No Such Element Exception was thrown !!! It means the checkBox is not on the page.");
            Assert.assertTrue(true);

        }

        //5.2. “It’s gone!” message is displayed.
        Assert.assertTrue(dynamicControlPage.itsGoneMessage.isDisplayed());



    }



    @Test
    public void TestT3 () {
        //TC #3: Explicit wait practice

        //3- Click to “Enable” button
        // use the object to click to enable button
        dynamicControlPage.enableBtn.click();

        //4- Wait until “loading bar disappears”
        // using custom BrowserUtils method 'waitFor..' to wait loadingBar disappears
        BrowserUtils.waitForInvisibilityOF(dynamicControlPage.loadingBar);

        //5- Verify:
        //a. Input box is enabled.
        Assert.assertTrue(dynamicControlPage.inputBox.isEnabled(), "Input box is not enabled!!!");

        //b. “It’s enabled!” message is displayed.
        Assert.assertTrue(dynamicControlPage.itsGoneMessage.isDisplayed(), "Message is not enabled!!!");

        String actualMessageText = dynamicControlPage.itsGoneMessage.getText();
        Assert.assertTrue(actualMessageText.equals("It's enabled!"));

    }


    @AfterMethod
    public void tearDownMethod(){
        Driver.closeDriver();
    }


}
