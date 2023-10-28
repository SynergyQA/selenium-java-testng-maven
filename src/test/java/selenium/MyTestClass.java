package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyTestClass extends MyDriverSetup{
    @Test
    public void testThisTets(){
        driver.navigate().to("https://www.saucedemo.com/v1/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();
        WebDriverWait myWait = new WebDriverWait (driver, Duration.ofSeconds(10), Duration.ofMillis(500));
        WebElement waitForIt = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='product_label']")));

        //add to cart
        driver.findElement(By.xpath("(//button[@class=\"btn_primary btn_inventory\"])[1]")).click();
        driver.findElement(By.cssSelector("#shopping_cart_container")).click();
        driver.findElement(By.linkText("CHECKOUT")).click();

        //checkout information
        driver.findElement(By.id("first-name")).sendKeys("diego");
        driver.findElement(By.id("last-name")).sendKeys("olzola");
        driver.findElement(By.id("postal-code")).sendKeys("4178");
        driver.findElement(By.xpath("//*[@VALUE='CONTINUE']")).click();
        driver.findElement(By.xpath("//*[text()='FINISH']")).click();
        WebElement wa        = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='THANK YOU FOR YOUR ORDER']")));

        Assert.assertTrue(driver.findElement(By.xpath("//*[text()=''THANK YOU FOR YOUR ORDER]")).isDisplayed());


    }

}
