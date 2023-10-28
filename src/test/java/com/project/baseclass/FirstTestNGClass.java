package com.project.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static java.util.concurrent.TimeUnit.SECONDS;

public class FirstTestNGClass {

    public static WebDriver driver;

    //@Parameters({"baseUrl"})
    @Parameters ({"baseUrl"})
    @BeforeTest
    public void setupDriver(@Optional("https://www.demoblaze.com")String baseUrl){
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().timeouts().pageLoadTimeout(30, SECONDS);
    }

    @Test
    public void FirstTest(){
        System.out.println(driver.getTitle());
    }

    @AfterTest
    public void tearDown(){
      //  driver.close();
       // driver.quit();
    }
}
