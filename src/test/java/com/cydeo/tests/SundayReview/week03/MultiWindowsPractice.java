package com.cydeo.tests.SundayReview.week03;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class MultiWindowsPractice extends TestBase {

    // TC : Windows handle practice

    @Test
    public void test(){

        //    1. Open browser
        //    2. Go to website: https://demoqa.com/browser-windows
        driver.get("https://demoqa.com/browser-windows");

        //    3. Click on New Tab button
        driver.findElement(By.id("tabButton")).click();

        //    4. Click on New Window button
        driver.findElement(By.id("windowButton")).click();

        //    5. Click on New Window Message button
        driver.findElement(By.id("messageWindowButton")).click();

        //    6. Store parent window handle id in a variable
        String parentWindowHandle = driver.getWindowHandle();

        //    7. Store all window handle ids in to a Set
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("allWindowHandles.size() = " + allWindowHandles.size());

        //    9. Print out each window title
        for (String eachWindow : allWindowHandles) {
            driver.switchTo().window(eachWindow);
            System.out.println("Current window titles= " + driver.getTitle());
        }

    }



}
