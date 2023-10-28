package selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FromScratch {
    WebDriver driver = new ChromeDriver();

    @Test
    public void Mytest() {
        driver.navigate().to("https://www.saucedemo.com/");
        String myTitle = driver.getTitle();
    }
}
