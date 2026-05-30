package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import org.openqa.selenium.By;

public class LargeDomPage extends BasePage {
    private final By tableRows = By.cssSelector("#large-table tbody tr");
    private final By tableCol =By.cssSelector("#large-table thead tr");
    private final By heading =By.cssSelector(".example h3");


    public void navigate(){
        openUrl(PropertiesReader.readKey("base_url")+"large");
    }

    public int getRowCount(){
        return  getDriver().findElements(tableRows).size();
    }
}
