package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import com.tanmay.utils.WaitHelpers;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends BasePage {

    private final By emailInput = By.id("email");
    private final By submitButton= By.id("form_submit");
    private final By errorMessage =By.tagName("h1");

    public void navigate(){
        openUrl(PropertiesReader.readKey("base_url")+"forgot_password");
    }

    public void submitWrongEmails(String emailId){
        enterInput(emailInput,emailId);
        clickElement(submitButton);
    }

    public String getPageHeading(){
        WaitHelpers.checkVisibility(getDriver(),errorMessage,10);
      return getText(errorMessage);
    }

}
