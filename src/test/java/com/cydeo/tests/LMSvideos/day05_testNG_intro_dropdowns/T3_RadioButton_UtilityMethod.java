package com.cydeo.tests.LMSvideos.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class T3_RadioButton_UtilityMethod {
    public static void main(String[] args) {

        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        //  click and verify hockey button is selected
        clickAndVerifyRadioButton(driver,"sport", "hokey");
        clickAndVerifyRadioButton(driver, "sport", "football");

        clickAndVerifyRadioButton(driver, "color", "red");



/*
        //Create a utility method to handle above logic.
        //Method name: clickAndVerifyRadioButton
        //Return type: void or boolean
        //Method args:
        //1. WebDriver
        //2. Name attribute as String (for providing which group of radio buttons)
        //3. Id attribute as String (for providing which radio button to be clicked)
        //Method should loop through the given group of radio buttons. When it finds the
        //matching option, it should click and verify option is Selected.
        //Print out verification: true

 */

    }

    private static void clickAndVerifyRadioButton (WebDriver driver, String nameAttribute, String expectedID ){

        //3. Locate all the sports radio button and store
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='"+nameAttribute+"']"));

        for (WebElement each : radioButtons) {
            String actualID = each.getAttribute("id");
            System.out.println(actualID);


            if ( actualID.equals( expectedID) ){
                each.click();
                System.out.println(actualID + " is selected: "+ each.isSelected());
                break;
            }



        }
    }


}

