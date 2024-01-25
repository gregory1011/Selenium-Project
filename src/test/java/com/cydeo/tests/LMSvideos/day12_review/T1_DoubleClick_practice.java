package com.cydeo.tests.LMSvideos.day12_review;

import com.cydeo.pages.W3page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_DoubleClick_practice {

    @Test
    public void test1(){

        // Follow POM
        //#1: Double Click Test
        //1. Go to
        //https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        //2. Switch to iframe.
        Driver.getDriver().switchTo().frame("iframeResult");

        //3. doubleClick on the text “Double-click me to change my text color.”
        // using W3page object to reach to the 'paragraph' webElement
        W3page w3page = new W3page();
        // w3page.paragraph.click();

        // Using Actions object to be able to doubleClick giving webElement
        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(w3page.paragraph).perform();

        //4. Assert: Text’s “style” attribute value contains “red”.
        // style="color: red;"
        String actualStyleAttributeValue = w3page.paragraph.getAttribute("style");
        String expectedStyleAttributeValue = "red";

        Assert.assertTrue(actualStyleAttributeValue.contains(expectedStyleAttributeValue));



    }
}
