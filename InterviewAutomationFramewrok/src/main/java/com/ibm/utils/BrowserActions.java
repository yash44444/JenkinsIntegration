package com.ibm.utils;

import com.ibm.config.ConfigFactory;
import com.ibm.driver.DriverManager;
import com.ibm.enums.WaitTypes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserActions {

    public static void click(By by) {
        WebElement element = WaitUntilElementPresent(by);
        element.click();
    }

    public static void sendKeys(By by, String text) {
        WebElement element = WaitUntilElementPresent(by);
        element.sendKeys(text);
    }

    public static void click(By by, WaitTypes waitType) {
        WebElement element = null;
        if (waitType == WaitTypes.PRESENT) {
            element = WaitUntilElementPresent(by);
        } else if (waitType == WaitTypes.CLICKABLE) {
            element = WaitUntilElementClickable(by);
        }
        element.click();
    }


        // The return type of WebDriverWait in Selenium WebDriver is a WebElement.
        public static WebElement WaitUntilElementPresent (By by){
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofMillis(ConfigFactory.getConfig().timeout()));
            return wait.until(ExpectedConditions.presenceOfElementLocated(by));
        }

        // The return type of WebDriverWait in Selenium WebDriver is a WebElement.
        public static WebElement WaitUntilElementClickable (By by){
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofMillis(ConfigFactory.getConfig().timeout()));
            return wait.until(ExpectedConditions.elementToBeClickable(by));
        }

    }

