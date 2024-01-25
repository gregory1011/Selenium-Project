package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackLoginPage {

    public VyTrackLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "prependedInput")
    public WebElement username;

    @FindBy (id = "prependedInput2")
    public WebElement password;

    @FindBy (id = "_submit")
    public WebElement loginBtn;


    public void loginAsDriver(){
        username.sendKeys(ConfigurationReader.getProperty("driverUsername"));
        password.sendKeys(ConfigurationReader.getProperty("driverPassword"));
        loginBtn.click();

    }

    public void loginAsSalesmanager(){
        username.sendKeys(ConfigurationReader.getProperty("salesmanagerUsername"));
        password.sendKeys(ConfigurationReader.getProperty("salesmanagerPassword"));
        loginBtn.click();
    }

    public void loginAsStoremanager(){
        username.sendKeys(ConfigurationReader.getProperty("storemanagerUsername"));
        password.sendKeys(ConfigurationReader.getProperty("storemanagerPassword"));
        loginBtn.click();
    }



}
