package com.ibm.pages;

import com.ibm.driver.DriverManager;
import com.ibm.pages.pageComponents.LeftMenu;

public class HomePage {

    private LeftMenu leftMenu;

    public HomePage(){
        leftMenu = new LeftMenu();
    }

    public void clickOnAdmin(){
        leftMenu.clickAdminMenu();
    }

    public void clickOnPIM(){
        leftMenu.clickPIMMenu();
    }

    public String getTitle(){
        return DriverManager.getDriver().getTitle();
    }

}
