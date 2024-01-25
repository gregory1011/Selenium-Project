package com.cydeo.tests.LMSvideos.day04_findElements_checkBox_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T3_checkboxes {
    public static void main(String[] args) {

        //TC#3: Checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //1. Go to https://practice.cydeo.com/checkboxes
        driver.get("https://practice.cydeo.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Confirm checkbox #1 is NOT selected by default
        // locate checkbox 1 and 2
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

        //3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());  // false
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected()); // true

        //4. Click checkbox #1 to select it.
        checkbox1.click();
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected()); // true

        //5. Click checkbox #2 to deselect it.
        checkbox2.click();
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected()); // false

        //6. Confirm checkbox #1 is SELECTED.

        //7. Confirm checkbox #2 is NOT selected.




    }
}
