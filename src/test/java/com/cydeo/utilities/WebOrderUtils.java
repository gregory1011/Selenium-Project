package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebOrderUtils {

    public static String returnOrderDate (WebDriver driver, String costumerName){
         //This method should accept a costumerName
        // and return the costumer order date as a String.
        String locator = "//td[.='"+costumerName+"']/../td[5]";

        WebElement costumerDateCell = driver.findElement(By.xpath(locator));

        return costumerDateCell.getText();

      //  return driver.findElement(By.xpath(locator)).getText(); //this is one line of code
    }

    public static void orderVerify (
            WebDriver driver, String costumerName, String expectedOrderDate) {
        //This method should accept above, mentioned arguments and internally assert
        //expectedOrderDate matching actualOrderDate.

        String locator = "//td[.='"+costumerName+"']/../td[5]";

         driver.findElement(By.xpath(locator)).getText();

         WebElement costumerDateCell = driver.findElement(By.xpath(locator));

         String actualOrderDate = costumerDateCell.getText();

        Assert.assertEquals(actualOrderDate, expectedOrderDate);

    }

}
