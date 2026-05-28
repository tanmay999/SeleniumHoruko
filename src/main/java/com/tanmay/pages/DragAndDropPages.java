package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragAndDropPages extends BasePage {

    private final By boxA = By.id("column-a");
    private final By boxB = By.id("column-b");

    public void navigate(){
        openUrl(PropertiesReader.readKey("base_url")+"drag_and_drop");
    }

    public String getBoxAHeaderText(){
        return  getText(boxA);
    }

    public String getBoxBHeaderText(){
        return  getText(boxB);
    }

    public void dragAtoB(){
        new Actions(getDriver()).dragAndDrop(getDriver().findElement(boxA),getDriver().findElement(boxB)).perform();
    }
}
