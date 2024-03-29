package com.cydeo.tests.SundayReview.week04;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablePractice extends BaseTest{


    @Test
    public void webTable_Test(){
         //TC : Web table practice
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/tables
        //3. Print table data as a single String, not so common, but useful sometimes
        WebElement table1 = Driver.getDriver().findElement(By.xpath("//table[@id='table1']"));
        System.out.println("table1.getText() = " + table1.getText());

        //4. verify tconway@earthlink.net is anywhere in the table
        Assert.assertTrue(table1.getText().contains("jsmith@gmail.com"), "jsmith@gmail.com email in not found in table1");

        //5. print all column names in single line
        WebElement columnText = Driver.getDriver().findElement(By.xpath("//table[@id='table1']/thead/tr"));
        System.out.println("columnText.getText() = " + columnText.getText());

        //6. print each column name in separate lines using a loop and findElements method
        List<WebElement> columnNames = Driver.getDriver().findElements(By.xpath("//table[@id='table1']/thead/tr/th"));

        for (WebElement each : columnNames) {
            System.out.println("Each columnName= "+ each.getText());
        }





    }
}
