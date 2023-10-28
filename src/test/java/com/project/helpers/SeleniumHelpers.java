package com.project.helpers;

import com.project.baseclass.FirstTestNGClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SeleniumHelpers extends FirstTestNGClass {


    public void MyfluentWait(By element) {
       if(!driver.findElement(element).isDisplayed()){
          CustomWait(5);
            System.out.println("waiting 5 seconds for the element: " + element );
       }
    }

    public void MyMethodTest() throws Exception{
        System.out.println("waiting 5 seconds for the element: ");
    }


    public void SmartClick(By element) {
        MyfluentWait(element);
        driver.findElement(element).click();
    }

    public void CustomWait(int time){
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public void CustomNavigate(String baseUrl){
        driver.navigate().to(baseUrl);
        CustomWait(5);
     }

    public void AssertElementIsPresent(String originalTitle, String expectedTitle){
        Assert.assertEquals(originalTitle, expectedTitle);
    }

    public void MyExplicitWait(By element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }


}
