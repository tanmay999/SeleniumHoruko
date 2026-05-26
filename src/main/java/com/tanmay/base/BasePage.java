package com.tanmay.base;

import com.tanmay.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    public WebDriver getDriver(){
        return DriverManager.getDriver();
    }

    public void openUrl(String url){
        getDriver().get(url);
    }

    public void clickElement(WebElement element){
        element.click();
    }

    public void clickElement(By by){
        getDriver().findElement(by).click();;
    }

    public void enterInput(WebElement element,String text){
        element.sendKeys(text);
    }

    public  void enterInput(By by, String text){
       getDriver().findElement(by).sendKeys(text);
    }

    public String getText(By by){
       return getDriver().findElement(by).getText();
    }

    public String getText(WebElement element){
        return  element.getText();
    }

    public boolean isElementDisplayed(By by){
        return getDriver().findElement(by).isDisplayed();
    }

    public boolean isElementEnabled(By by){
        return  getDriver().findElement(by).isDisplayed();
    }

    public boolean isElementSelected(By by){
        return getDriver().findElement(by).isEnabled();
    }



}
