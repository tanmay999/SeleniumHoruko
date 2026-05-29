package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import com.tanmay.utils.WaitHelpers;
import org.openqa.selenium.By;

public class EntryAdPage extends BasePage {

    private final By modal = By.id("modal");
    private final By closeButton =By.cssSelector("#modal .modal-footer p");
    private final By restartButton = By.cssSelector("restart-ad");
    private final By modalTitle =By.cssSelector("modal .modal-title h3");


    public void navigate(){
        openUrl(PropertiesReader.readKey("base_url")+"entry_ad");
    }

    public void clickRestartButton(){
        clickElement(restartButton);
        WaitHelpers.checkVisibility(getDriver(),modal,10);
    }

    public boolean isaModalDisplayed(){
        WaitHelpers.checkVisibility(getDriver(),modal,10);
        return true;
    }

    public boolean isModalClosed(){
        WaitHelpers.waitForInvisibility(getDriver(),modal,10);
        return true;
    }

    public void closeModal(){
        WaitHelpers.checkVisibility(getDriver(),closeButton,10);
        clickElement(closeButton);
        WaitHelpers.waitForInvisibility(getDriver(),modal,10);
    }




}
