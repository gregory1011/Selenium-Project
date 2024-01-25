package com.cydeo.utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// This class will store method related to CRM
public class CRM_Utilities {

    // This method will log in with below credentials'
    // username: helpdesck1@cydeo.com
    // password: UserUser

    public static void login_CRM (WebDriver driver){
        //   3. Enter valid username
        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("helpdesck1@cydeo.com");

        //   4. Enter valid password
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        //   5. Click to `Log In` button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginBtn.click();

    }


    public static void login_CRM (WebDriver driver, String username, String password){
        //   3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys(username);

        //   4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(password);

        //   5. Click to `Log In` button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginBtn.click();

    }




}
