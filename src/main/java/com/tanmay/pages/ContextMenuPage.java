package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends BasePage {

    private final By hotspot  = By.id("hot-spot");

    public void navigate(){
        openUrl(PropertiesReader.readKey("base_url")+"context_menu");
    }

    public String rightClickAndGetAlertText(){
        Actions actions = new Actions(getDriver());
        actions.contextClick(getDriver().findElement(hotspot)).perform();
        Alert alert = getDriver().switchTo().alert();
        return alert.getText();

    }


}
