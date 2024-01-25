package com.cydeo.tests.SundayReview.week04;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    @BeforeMethod
    public void setupMethod(){

        Driver.getDriver().get(ConfigurationReader.getProperty("webTable.url"));

    }


    @AfterMethod
    public void tearDownMethod(){

        Driver.getDriver();

    }
}
