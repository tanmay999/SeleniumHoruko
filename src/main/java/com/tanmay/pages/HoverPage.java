package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import com.tanmay.utils.WaitHelpers;
import io.qameta.allure.testng.TestInstanceParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HoverPage extends BasePage {

    private final By figures = By.cssSelector(".figure");
    private final By figCaptionsLocator = By.cssSelector(".figcaption");

    public void navigate(){
        openUrl(PropertiesReader.readKey("base_url")+"hovers");
    }


    public void hoverOverFigures(int index){
        List<WebElement> figs = getDriver().findElements(figures);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(figs.get(index)).perform();
        WaitHelpers.checkVisibility(getDriver() ,By.cssSelector(".figure:nth-of-type("+(index+1)+") .figcaption"),10);

    }



    public String getFigCaptionText(int index){
        List<WebElement> figCaptions =getDriver().findElements(figCaptionsLocator);
        return figCaptions.get(index).getText();
    }


}
