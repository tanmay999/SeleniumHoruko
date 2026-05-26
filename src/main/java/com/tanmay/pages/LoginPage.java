package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import com.tanmay.utils.WaitHelpers;
import org.openqa.selenium.By;

import java.util.Properties;

public class LoginPage extends BasePage {

    private final By usernameField =By.id("username");
    private final By passwordField =By.id("password");
    private final By loginButton =By.cssSelector("button[type='submit']");
    private final By flashMessage =By.cssSelector("#flash");

    private void navigate(){
        openUrl(PropertiesReader.readKey("base_url")+"/login");
    }


    public SecureAreaPage loginWithValidCred(){
        navigate();
        enterInput(usernameField, PropertiesReader.readKey("valid_username"));
        enterInput(passwordField,PropertiesReader.readKey("valid_password"));
        clickElement(loginButton);
        return new SecureAreaPage();
    }

    public String invalidCredLogin(){
        navigate();
        enterInput(usernameField,PropertiesReader.readKey("invalid_username"));
        enterInput(passwordField,PropertiesReader.readKey("invalid_password"));
        clickElement(loginButton);
        WaitHelpers.checkVisibility(getDriver(), flashMessage);
        return getText(flashMessage);

    }

}
