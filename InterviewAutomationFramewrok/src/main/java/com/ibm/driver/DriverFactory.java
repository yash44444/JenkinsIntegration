package com.ibm.driver;

import com.ibm.config.ConfigFactory;
import com.ibm.config.FrameworkConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public final class DriverFactory {

    private DriverFactory(){}

    public static WebDriver getBrowser(String browserName,String runmode) throws MalformedURLException {
        WebDriver driver = null;
        if(runmode.equalsIgnoreCase("local")) {
            driver = LocalDriverFactory.getLocalDriver(browserName);
        } else if(runmode.equalsIgnoreCase("remote")){
            driver = RemoteDriverFactory.getRemoteDriver(browserName);
        }
        return driver;
    }
}
