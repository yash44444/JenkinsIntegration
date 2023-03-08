package com.ibm.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    // By default thread local value will be null. will call driver factory only if threadlcoal is null and then we set browser
    private static final ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    public static WebDriver getDriver(){
        return threadLocal.get();
    }

    public static void setDriver(WebDriver driver){
        threadLocal.set(driver);
    }


}
