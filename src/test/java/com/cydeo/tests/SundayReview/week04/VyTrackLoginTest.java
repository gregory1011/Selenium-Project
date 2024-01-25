package com.cydeo.tests.SundayReview.week04;

import com.cydeo.pages.VyTrackLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VyTrackLoginTest {


    VyTrackLoginPage vytrackLoginPage;

    @BeforeMethod
    public void setup(){
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));
        vytrackLoginPage = new VyTrackLoginPage();
    }



    @Test
    public void driver_Test(){

       // Driver.getDriver().get(ConfigurationReader.getProperty("VyTrack.url"));


       // VyTrackLoginPage vyTrackLoginPage = new VyTrackLoginPage();

       // vyTrackLoginPage.username.sendKeys(ConfigurationReader.getProperty("driverUsername"));
       // vyTrackLoginPage.password.sendKeys(ConfigurationReader.getProperty("driverPassword"));
       // vyTrackLoginPage.loginBtn.click();

        vytrackLoginPage.loginAsDriver();

    }


    @Test
    public void vytrack_salesmanager_login_test(){

        // VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();
        vytrackLoginPage.loginAsSalesmanager();

    }


    @Test
    public void vytrack_storemanager_login_test(){

        vytrackLoginPage.loginAsStoremanager();

    }

    @AfterMethod
    public void teardown(){
        Driver.closeDriver();
    }






}
