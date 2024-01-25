package com.cydeo.tests.practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Actions {

    
@BeforeMethod
    public void setup(){
    Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
}

    @Test
    public void test1() {
        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//*[@id=\"droptarget\"]"));

        System.out.println("bigCircle.getText() = " + bigCircle.getText());
    }
}
