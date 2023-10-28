package selenium;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTestFromScratchTest{
    WebDriver driver = new ChromeDriver();

    @Test
    public void myTestMethod(){
        driver.navigate().to("https://www.demoblaze.com/");
        System.out.println(driver.getTitle());
        String myDescription = driver.findElement(By.linkText("PRODUCT STORE")).getText();
        System.out.println(myDescription);
    }

    @After
    public void closeDriver(){
        driver.close();
        driver.quit();
    }

}
