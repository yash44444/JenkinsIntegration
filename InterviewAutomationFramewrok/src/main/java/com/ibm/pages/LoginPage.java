package com.ibm.pages;

import com.ibm.driver.DriverManager;
import com.ibm.enums.WaitTypes;
import com.ibm.utils.BrowserActions;
import org.openqa.selenium.By;

public class LoginPage {

    private static final By TXTBOX_USERNAME = By.xpath("//input[@placeholder='Username']");
    private static final By TXTBOX_PASSWORD = By.xpath("//input[@placeholder='Password']");
    private static final By BTN_SUBMIT = By.xpath("//button[@type='submit']");

    private LoginPage SetUserName(String username){
        BrowserActions.sendKeys(TXTBOX_USERNAME,username);
        return this;
    }

    private LoginPage SetPassword(String password){
        BrowserActions.sendKeys(TXTBOX_PASSWORD,password);
        return this;
    }

    private HomePage clickSubmit(){
        BrowserActions.click(BTN_SUBMIT);
        return new HomePage();

    }

    // Since driver is static, it has to be called via class. So we use Driver.driver
    public HomePage loginToApplication(String username, String password) {
        return SetUserName(username).SetPassword(password).clickSubmit();

    }
}

