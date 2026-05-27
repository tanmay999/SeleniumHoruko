package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import com.tanmay.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class DynamicControlsPage extends BasePage {

    private final By removeAddButton = By.cssSelector("#checkbox-example button");
    private final By enableDisable =By.cssSelector("#input-example button");
    private final By checkBox =By.cssSelector("#checkbox-example input[type='checkbox']");
    private final By message =By.id("message");
    private final By textInput = By.cssSelector("#input-example input[type='text']");


    public void navigate(){
        openUrl(PropertiesReader.readKey("base_url")+"/dynamic_controls");
    }

    public void clickRemoveCheckBox(){
        clickElement(removeAddButton);
        WaitHelpers.checkVisibility(getDriver(),message,10);
    }


    public void clickEnableDisableInput(){
        clickElement(enableDisable);
        WaitHelpers.checkVisibility(getDriver(),message,10);
    }

    public boolean isInputEnabled(){
        return getDriver().findElement(textInput).isEnabled();
    }

    public boolean isCheckBoxPresent(){
        try {
            return !getDriver().findElements(checkBox).isEmpty();
        }
        catch (NoSuchElementException e){
            return  false;
        }
    }


    public String getMessage(){
        return getText(message);
    }
}


