package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class DynamicContentPage extends BasePage {

    private final By contentRows = By.cssSelector("#content .row");

    public void navigate(){
        openUrl(PropertiesReader.readKey("base_url")+"dynamic_content");
    }


    public int getRowCount(){
        return getDriver().findElements(contentRows).size();
    }

    public List<String> getRowTexts(){
        List<WebElement> rows = getDriver().findElements(contentRows);
        return  rows.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public void refresh(){
        getDriver().navigate().refresh();
    }
}
