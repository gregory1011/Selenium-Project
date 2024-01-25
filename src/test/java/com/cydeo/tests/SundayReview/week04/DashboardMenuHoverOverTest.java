package com.cydeo.tests.SundayReview.week04;

import com.cydeo.pages.VyTrackDashboardPage;
import com.cydeo.pages.VyTrackLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class DashboardMenuHoverOverTest {



    @Test
    public void mainMenuTest() {

        // TC: Vytrack app main menus test as Salesmanager
        // 1- Open a chrome browser
        // 2- Go to: https://qa3.vytrack.com/user/login
        Driver.getDriver().get(ConfigurationReader.getProperty("VyTrack.url"));

        // 3. Enter username salesmanager120
        // 4. Enter password UserUser123
        // 5. Click to Login button
        VyTrackLoginPage vyTrackLoginPage = new VyTrackLoginPage();
        vyTrackLoginPage.loginAsSalesmanager();

        BrowserUtils.sleep(5);

        // 6. Hover over each main menu

        Actions actions = new Actions(Driver.getDriver());

        VyTrackDashboardPage dashboardPage = new VyTrackDashboardPage();

        List<WebElement> mainMenus = dashboardPage.mainMenu;

        for ( WebElement eachMenu : mainMenus ){

            actions.moveToElement(eachMenu).perform();
            BrowserUtils.sleep(3);

        }




    }



}
