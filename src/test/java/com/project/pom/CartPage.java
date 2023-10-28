package com.project.pom;

import com.project.baseclass.FirstTestNGClass;
import com.project.helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class CartPage extends FirstTestNGClass {

    SeleniumHelpers seleniumHelpers = new SeleniumHelpers();

    By cartsLink = By.xpath("//*[@id='cartur']");
    By cartTable = By.xpath("//*[@class='table-responsive']");

    public void NavigateToCart(){
        seleniumHelpers.SmartClick(cartsLink);
        seleniumHelpers.MyfluentWait(cartTable);
    }

}
