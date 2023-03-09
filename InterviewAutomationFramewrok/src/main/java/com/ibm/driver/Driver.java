package com.ibm.driver;

import com.ibm.config.ConfigFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.time.Duration;

public final class Driver {

    private Driver() {
    }

    public static void initDriver() throws MalformedURLException {
        String browser = ConfigFactory.getConfig().browser();
        if (DriverManager.getDriver() == null) {
            WebDriver driver = DriverFactory.getBrowser("local","chrome");   // since getBrowser method will return a driver, we are storing in a WebDriver variable
            DriverManager.setDriver(driver);  // This method will make sure driver is thread safe.
            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().get(ConfigFactory.getConfig().url());
            DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(ConfigFactory.getConfig().timeout()));
        }
    }


    public static void quitDriver() {
        if (DriverManager.getDriver() != null) {
            DriverManager.getDriver().quit();
        }
    }
}
