package com.cydeo.tests.LMSvideos.day10_Upload_Actions_JSexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6_JavascriptExecutor_Practice {

    @Test
    public void test() throws InterruptedException {
        // 1- Open Chrome browser
        //2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

       // ( (JavascriptExecutor) Driver.getDriver() ).executeScript("window.scrollBy(x, y)")
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        // window.scrollBy(x, y)
        BrowserUtils.sleep(5);

        //3- Use below JavaScript method and scroll
        //a. 750 pixels down 10 times.

        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0, 750)");
        }

        //b. 750 pixels up 10 times
        //JavaScript method to use : window.scrollBy(0,0)

        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0, -750)");
        }

        Thread.sleep(1000);





    }





}
