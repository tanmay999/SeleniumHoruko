package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import com.tanmay.utils.WaitHelpers;
import io.qameta.allure.testng.TestInstanceParameter;
import org.openqa.selenium.By;

public class FileUploadPage extends BasePage {

    private final By fileInput = By.id("file-upload");
    private final By fileUploadButton = By.id("file-submit");
    private final By uploadFilesText =By.id("uploaded-files");
    private final By content =By.cssSelector("#content h3");

    public void navigate(){
        openUrl(PropertiesReader.readKey("base_url")+"upload");
    }

    public String  uploadFile(String absPath){
        getDriver().findElement(fileInput).sendKeys(absPath);
        clickElement(fileUploadButton);
        WaitHelpers.checkVisibility(getDriver(), uploadFilesText);
        return  getText(content);

    }



}
