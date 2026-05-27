package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DropdownPages extends BasePage {

    protected  final By dropdown=By.id("dropdown");

    public void navigate(){
        openUrl(PropertiesReader.readKey("base_url")+"/dropdown");
    }

    public Select getDropdown(By dropdown){
        return new Select(getDriver().findElement(dropdown));
    }

    public void selectByVisibleText(String text){
        getDropdown(dropdown).selectByVisibleText(text);
    }

    public void selectByValue(String value){
        getDropdown(dropdown).selectByValue(value);
    }

    public String getSelectedOptions(){
        return getDropdown(dropdown).getFirstSelectedOption().getText();
    }
}
