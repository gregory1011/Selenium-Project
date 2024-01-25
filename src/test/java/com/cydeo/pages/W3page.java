package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W3page {


    // 1. Create constructor and initialize the 'driver' instance and 'object' of the current class:
    public W3page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // 2. Instead using findElement() method we use @FindBy annotation
    @FindBy (id = "demo")
    public WebElement paragraph;



}
