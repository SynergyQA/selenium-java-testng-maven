package com.project.pom;

import com.project.helpers.SeleniumHelpers;
import com.project.baseclass.FirstTestNGClass;
import org.openqa.selenium.By;

public class HomePage extends FirstTestNGClass{

    private final By productStoreLink = By.linkText("PRODUCT STORE");
    private final By phonesLink = By.linkText("Phones");
    private final By monitorsLink = By.linkText("Monitors");
    private final By appleMonitorLink = By.linkText("Apple monitor 24");


    SeleniumHelpers seleniumHelpers = new SeleniumHelpers();

    public void navigateToMonitors(){
        seleniumHelpers.SmartClick(monitorsLink);

    }

}
