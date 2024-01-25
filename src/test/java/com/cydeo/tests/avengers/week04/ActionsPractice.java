package com.cydeo.tests.avengers.week04;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ActionsPractice extends TestBase {

    @Test
    public void action_test(){

        //    - Go to  "https://www.globalsqa.com/demo-site/draganddrop/"
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

        driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame.lazyloaded")));

        //    - Drag and Drop "High Tatras" and "High Tatras 2" into "Trash"
        WebElement firstImg = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
        WebElement secondImg = driver.findElement(By.xpath("//img[@src='images/high_tatras2_min.jpg']"));

        WebElement trashBox = driver.findElement(By.id("trash"));


        Actions actions = new Actions(driver);

        actions.dragAndDrop(firstImg, trashBox).perform();
        actions.dragAndDrop(secondImg, trashBox).perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(firstImg));
        wait.until(ExpectedConditions.visibilityOf(secondImg));

        //    - Verify Trash has 2 photo
        List<WebElement> trashImgs = driver.findElements(By.xpath("//div[@id='trash']/ul/li"));

        Assert.assertTrue(trashImgs.size() == 2);




    }








}
