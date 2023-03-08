package com.ibm.tests;

import com.ibm.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Test(description = "To check if the user is able login to application")
    public void loginToApplication_Test(String username,String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.loginToApplication(username,password);
    }
}
