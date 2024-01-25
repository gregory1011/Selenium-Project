package com.cydeo.tests.LMSvideos.day04_findElements_checkBox_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {
    public static void main(String[] args) {

        // TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        /* using cssSelector
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeLink = driver.findElement(By.cssSelector("a[href='/']");
         */
        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));

        //b. “Forgot password” header
        //WebElement headerForgotPass = driver.findElement(By.cssSelector("div[class='example'] > h2"));
        //WebElement headerForgotPass = driver.findElement(By.cssSelector("div.example > h2"));

        // WebElement headerLink = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        WebElement headerLink = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        //c. “E-mail” text
       // WebElement emailText = driver.findElement(By.cssSelector("label[for='email']"));
         WebElement emailText = driver.findElement(By.xpath("//label[@for='email']"));
       // WebElement emailText = driver.findElement(By.xpath("//label[.='email']"));


        //d. E-mail input box
        //WebElement emailInbox = driver.findElement(By.cssSelector("input[name='email']"));
        //WebElement emailInbox = driver.findElement(By.cssSelector("input[pattern='[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$']"));
        //WebElement emailInbox = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement emailInbox = driver.findElement(By.xpath("//input[contains(@pattern, 'a-z')]"));


        //e. “Retrieve password” button
       // WebElement retrievePasswordButton = driver.findElement(By.cssSelector("i[class='radius']"));
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));

        //f. “Powered by Cydeo text
        //WebElement poweredByCydeoText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));

        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));


        //4. Verify all web elements are displayed.
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("headerLink.isDisplayed() = " + headerLink.isDisplayed());
        System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());
        System.out.println("emailInbox.isDisplayed() = " + emailInbox.isDisplayed());
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());

        driver.close();

    }
}
