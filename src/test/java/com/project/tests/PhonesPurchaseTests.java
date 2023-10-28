package com.project.tests;

import com.project.pom.CartPage;
import com.project.pom.HomePage;
import com.project.baseclass.FirstTestNGClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PhonesPurchaseTests extends FirstTestNGClass {

    HomePage homePage = new HomePage();
    CartPage cartPage = new CartPage();
    @Test
    public void ThirdTest(){
        homePage.navigateToMonitors();
        cartPage.NavigateToCart();
        Assert.assertTrue(driver.getCurrentUrl().contains("cart"),"it's not equal");
    }
}
