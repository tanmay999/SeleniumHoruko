package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FileDownloadPage extends BasePage {

    private final By downloadLinks = By.cssSelector("a[href*='download']");

    public void navigate(){
        openUrl(PropertiesReader.readKey("base_url")+"download");
    }

    public int getLinkCount(){
        return getDriver().findElements(downloadLinks).size();
    }

    public List<WebElement> getDownloadLink(){
        return  getDriver().findElements(downloadLinks);
    }

    public String getFirstFileName(){
        List<WebElement> links = getDriver().findElements(downloadLinks);
        return links.isEmpty() ? "" : links.get(0).getText();
    }


}
