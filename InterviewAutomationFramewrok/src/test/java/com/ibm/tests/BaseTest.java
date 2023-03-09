package com.ibm.tests;

import com.ibm.driver.Driver;
import com.ibm.driver.DriverManager;
import com.ibm.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class BaseTest {

    @BeforeMethod
    public static void setDriver() throws MalformedURLException {
        Driver.initDriver();
    }

    @AfterMethod
    public static void closeBrowser() {
        Driver.quitDriver();
    }


}
