package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import org.openqa.selenium.By;

public class DisappearingElementPage extends BasePage {

    private final By navItems = By.cssSelector("ul li");

    public void navigate(){
        openUrl(PropertiesReader.readKey("base_url")+"disappearing_elements");
    }

    public int getNavItemsCount(){
        return getDriver().findElements(navItems).size();
    }
}
