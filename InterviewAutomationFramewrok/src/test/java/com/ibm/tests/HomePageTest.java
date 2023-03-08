package com.ibm.tests;

import com.ibm.driver.Driver;
import com.ibm.driver.DriverManager;
import com.ibm.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test(description = "To check title of page")
    public void titleValidation_Test(String username,String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        String ActualTitle = loginPage.loginToApplication(username,password).getTitle();
        String title = "OrangeHRM";
        Assert.assertEquals(ActualTitle,title);

    }
}
