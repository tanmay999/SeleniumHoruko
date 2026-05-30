package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.rmi.MarshalException;

public class FloatingMenuPage extends BasePage {
    private final By menu =By.id("menu");
    private final By menuLinks=By.cssSelector("#menu a");

    public void navigate(){
        openUrl(PropertiesReader.readKey("base_url")+"floating_menu");
    }

    public boolean isMenuDisplayed(){
      return   isElementDisplayed(menu);
    }

    public int  getMenuLinksCount(){
        return getDriver().findElements(menuLinks).size();
    }


    public void scrollToBottom(){
        JavascriptExecutor js =(JavascriptExecutor) getDriver();
       js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }


    public boolean isMenuStillVisible(){
        return  getDriver().findElement(menu).isDisplayed();
    }
}
