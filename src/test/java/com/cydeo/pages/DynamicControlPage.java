package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlPage {

    //1. Create constructor and initialize 'driver' and 'objcet'of the class.

    public DynamicControlPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //2. Using element by @FindBy annotation
    @FindBy (xpath = "//button[text()='Remove']")
    public WebElement removeBtn;


    @FindBy (id = "loading")
    public WebElement loadingBar;

    @FindBy (xpath = "//input[@type='checkbox']")
    public WebElement checkBox;

    @FindBy (id = "message")
    public WebElement itsGoneMessage;

    @FindBy (xpath = "//input[@type='text']")
    public WebElement inputBox;

    @FindBy (xpath = "//button[.='Enable'] ")
    public WebElement enableBtn;

    @FindBy (xpath = "//p[@id='message']")
    public WebElement messageDisplayed;






}
