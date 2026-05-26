package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.WaitHelpers;
import org.openqa.selenium.By;

public class SecureAreaPage extends BasePage {


    private final By flashMessage = By.cssSelector("#flash");
    private final By logoutButton =By.cssSelector("a.button");

    public String getFlashMessage(){
        WaitHelpers.checkVisibility(getDriver(),flashMessage);
        return getText(flashMessage);
    }

    public void logout(){
        clickElement(logoutButton);
    }
}
