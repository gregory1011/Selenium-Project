package com.cydeo.tests.LMSvideos.day11_pom_explicit_waits;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class T2_T6_dragAndDropActions {

    @BeforeMethod
    public void setupMethod(){

        // Step1. Go to https://practice.cydeo.com/drag_and_drop_circles
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
    }

    @Test
    public void test1(){
        // TC2 #: Drag and drop default value verification
        //1. Go to https://practice.cydeo.com/drag_and_drop_circles
       // Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");

        //2. Verify big circle default text is as below.
        WebElement bigCircleText = Driver.getDriver().findElement(By.id("droptarget"));

        //3. Assert:
        //-Text in big circle changed to: “Drag the small circle here.”
        String expectedText = "Drag the small circle here.";
        String actualBigCircleText = bigCircleText.getText();

        assertTrue(actualBigCircleText.equals(expectedText));

    }

    @Test
    public void test2(){
        // TC3 #: Drag and drop into the big circle
        //1. Go to https://practice.cydeo.com/drag_and_drop_circles

        // Locating circle webElements
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        // Creating the Actions object to do our actions
        Actions actions = new Actions(Driver.getDriver());

        //2. Drag and drop the small circle to bigger circle.
        //actions.dragAndDrop(smallCircle, bigCircle).perform();

        actions.clickAndHold(smallCircle).
          pause(1000).moveToElement(bigCircle).pause(1000).release().perform();

        //3. Assert:
        //-Text in big circle changed to: “You did great!”
        String expectedText = "You did great!";
        String actualText = bigCircle.getText();
       // Assert.assertTrue(actualText.equals(expectedText));

    }

    @Test
    public void test3(){
       // TC4 #: Click and hold
        //1. Go to https://practice.cydeo.com/drag_and_drop_circles

        // Locating circle webElements
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        // Creating the Actions object to do our actions
        Actions actions = new Actions(Driver.getDriver());

        //2. Drag and drop the small circle to bigger circle.
        //actions.dragAndDrop(smallCircle, bigCircle).perform();

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        (actions.clickAndHold(smallCircle).
                pause(1000).
                moveToElement(cydeoLink)).pause(1000).perform();

        //3. Assert:
        //-Text in big circle changed to: “Drop here.”
        String expectedText = "Drop here.";
        String actualText = bigCircle.getText();
        // Assert.assertTrue(actualText.equals(expectedText));

    }


    @Test
    public void test4(){
        // TC5 #: Drag and drop outside of the big circle
        //1. Go to https://practice.cydeo.com/drag_and_drop_circles

        // Locating circle webElements
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        // Creating the Actions object to do our actions
        Actions actions = new Actions(Driver.getDriver());

        //2. Drag and drop the small circle to bigger circle.
        //actions.dragAndDrop(smallCircle, bigCircle).perform();

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        (actions.clickAndHold(smallCircle).
                pause(1000).
                moveToElement(cydeoLink)).pause(1000).release().perform();

        //3. Assert:
        //-Text in big circle changed to: “Try again!”
        String expectedText = "Try again!";
        String actualText = bigCircle.getText();
        Assert.assertTrue(actualText.equals(expectedText));

    }


    @Test
    public void test5(){
        // TC6 #: Drag and hover
        //1. Go to https://practice.cydeo.com/drag_and_drop_circles

        // Locating circle webElements
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        // Creating the Actions object to do our actions
        Actions actions = new Actions(Driver.getDriver());

        //2. Drag and drop the small circle to bigger circle.
        //actions.dragAndDrop(smallCircle, bigCircle).perform();

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        (actions.clickAndHold(smallCircle).
                pause(1000).
                moveToElement(bigCircle)).pause(1000).perform();

        //3. Assert:
        //-Text in big circle changed to: “Now drop...”
        String expectedText = "Now drop...";
        String actualText = bigCircle.getText();
        Assert.assertTrue(actualText.equals(expectedText));

    }



    @AfterMethod
    public void tearDownMethod(){
    BrowserUtils.sleep(3);
    //Driver.closeDriver();
}


}
