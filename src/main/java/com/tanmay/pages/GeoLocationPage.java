package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import com.tanmay.utils.WaitHelpers;
import org.openqa.selenium.By;

public class GeoLocationPage extends BasePage {

    private final By whereAmIButton = By.xpath("//button[text()='Where am I?']");
    private final By latVal =By.id("lat-value");
    private final By longVal =By.id("long-value");


    public void navigate(){
        openUrl(PropertiesReader.readKey("base_url")+"geolocation");
    }

    public void clickButton(){
        clickElement(whereAmIButton);
    }

    public String getLatitude(){
        WaitHelpers.checkVisibility(getDriver(),latVal,15);
        return  getText(latVal);
    }

}
