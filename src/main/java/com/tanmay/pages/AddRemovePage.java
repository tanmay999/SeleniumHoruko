package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemovePage extends BasePage {


    protected final By addElementButton = By.xpath("//button[text()='Add Element']");
    protected final By deleteElementButton =By.cssSelector("button.added-manually");

    public void navigate(){
        openUrl(PropertiesReader.readKey("base_url")+"/add_remove_elements/");
    }

    public void clickAddElement(){
        clickElement(addElementButton);
    }

    public void  clickAddElementNTimes(int count){
        for(int i=0;i<count;i++){
            clickElement(addElementButton);
        }
    }

    public void clickDeleteElement(int index){
        List<WebElement> deleteButtons = getDriver().findElements(deleteElementButton);
        deleteButtons.get(index).click();
    }

    public int getDeleteButtonCount(){
        return  getDriver().findElements(deleteElementButton).size();
    }

}
