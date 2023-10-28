package selenium;

import com.google.common.annotations.VisibleForTesting;
import org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyFirstTest {

    @Test
    public void startWebDriver(){
        WebDriver driver = new ChromeDriver();

        try{
        driver.navigate().to("https://www.saucedemo.com/");
        String myTitle = driver.getTitle();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(500));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("use-name")));

        System.out.println(myTitle);
        assertEquals("Swag Labs", myTitle);
        assertTrue("Swag Labs",myTitle.startsWith("Swa"));
        }
        catch ( Exception e) {
            driver.close();
            driver.quit();
        }
    }
    
}
