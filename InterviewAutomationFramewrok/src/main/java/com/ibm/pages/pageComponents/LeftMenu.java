package com.ibm.pages.pageComponents;

import com.ibm.driver.DriverManager;
import com.ibm.utils.BrowserActions;
import org.openqa.selenium.By;

public class LeftMenu {

    // HomePage has a top menu. This HAS A relatinoship is called composition.

    // Admin, PIM, Leave, Time, Recruitment, My info, Performance, Dashboard, Directory, Maintainance, Buzz

    By LINK_ADMIN = By.xpath("//a[normalize-space()='Admin']");
    By LINK_PIM = By.xpath("//a[normalize-space()='PIM']");

    public void clickAdminMenu(){
        BrowserActions.click(LINK_ADMIN);
    }

    public void clickPIMMenu(){
        BrowserActions.click(LINK_ADMIN);
        BrowserActions.click(LINK_ADMIN);
    }



}
