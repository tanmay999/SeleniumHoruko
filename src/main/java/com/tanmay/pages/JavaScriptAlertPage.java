package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class JavaScriptAlertPage extends BasePage {

    private final By alertButton = By.xpath("//button[text()='Click for JS Alert']");
    private final By confirmButton =By.xpath("//button[text()='Click for JS Confirm']");
    private final By promptButton =By.xpath("//button[text()='Click for JS Prompt']");
    private final By resultText =By.id("result");


    public void navigate(){
        openUrl(PropertiesReader.readKey("base_url")+"javascript_alerts");
    }


    public void clickAlertAndAccept(){
        clickElement(alertButton);
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }


    public void clickConfirmAlert(){
        clickElement(confirmButton);
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }

    public void clickCancelAlert(){
        clickElement(confirmButton);
        Alert alert = getDriver().switchTo().alert();
        alert.dismiss();
    }

    public void clickSendTextAlert(){
        clickElement(promptButton);
        Alert alert = getDriver().switchTo().alert();
        alert.sendKeys("test alert");
        alert.accept();
    }

    public String getTextAlert(){
      return   getDriver().findElement(resultText).getText();
    }





}
