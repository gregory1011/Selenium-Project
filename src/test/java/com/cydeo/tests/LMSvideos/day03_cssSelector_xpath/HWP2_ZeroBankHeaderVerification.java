package com.cydeo.tests.LMSvideos.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP2_ZeroBankHeaderVerification {

    public static void main(String[] args) {

        //HWP #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        //Expected: “Log in to ZeroBank”

       // WebElement locateHeaderText = driver.findElement(By.cssSelector("h3");
        WebElement locateHeaderText = driver.findElement(By.xpath("//h3"));

        String expectedHeaderText = "Log in to ZeroBank";
        String actualHeaderText = locateHeaderText.getText();

        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Text header pass");
        }else{
            System.err.println("Text header fail");
        }

        driver.close();

    }
}
