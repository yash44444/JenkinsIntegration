package com.ibm.tests;

import com.ibm.driver.Driver;
import com.ibm.driver.DriverManager;
import com.ibm.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public static void setDriver() {
        Driver.initDriver();
    }

    @AfterMethod
    public static void closeBrowser() {
        Driver.quitDriver();
    }


}
