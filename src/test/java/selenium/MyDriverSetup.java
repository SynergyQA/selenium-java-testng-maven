package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyDriverSetup {

    WebDriver driver = new ChromeDriver();


     @Before
     public void setupMyWebDriver(){


     }

    @Test
    public void Test1(){
        driver.navigate().to("https://www.saucedemo.com/");
        String myTitle = driver.getTitle();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(500));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user-name")));

        WebElement userNameField = driver.findElement(By.name("user-name"));
        //id
        WebElement userNameId = driver.findElement(By.id("user-name"));
        //name
        WebElement userNameByName = driver.findElement(By.name("user-name"));
        //class name
      //  WebElement userNameByClassName = driver.findElement(By.className("from_input"));
        //tag name
        WebElement userNameByTagName = driver.findElement(By.tagName("input"));
        //css selector
        WebElement userNameByCssSelector = driver.findElement(By.cssSelector("#user-name"));
        //xpath
        WebElement userNameByXpath = driver.findElement(By.xpath("//input[@id='user-name']"));

        assertEquals("Swag Labs", myTitle);
        assertTrue("Swag Labs",myTitle.startsWith("Swa"));
        System.out.println(myTitle);

    }

    @Test
    public void test2(){

         driver.navigate().to("https://ultimateqa.com/simple-html-elements-for-automation/");
         WebElement linkByLink = driver.findElement(By.linkText("Click this button using \"ID\""));

    }


    @After
    public void closeMyBrowser(){
            driver.close();
            driver.quit();
    }




}
