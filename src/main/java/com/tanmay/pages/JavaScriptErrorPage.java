package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.util.List;
import java.util.logging.Level;

public class JavaScriptErrorPage extends BasePage {

    private final By  bodyText= By.cssSelector("body > p");

    public void navigate(){
        openUrl(PropertiesReader.readKey("base_url")+"javascript_error");
    }


    public String getBodyText(){
        return getText(bodyText);
    }

    private List<LogEntry> getBrowserConsoleLogs(){
        return getDriver().manage().logs().get(LogType.BROWSER).getAll();
    }

    public boolean hasJavaScriptError(){
       return getBrowserConsoleLogs().stream().anyMatch(e->e.getMessage().toLowerCase().contains("error")||
                e.getLevel().intValue()>= Level.SEVERE.intValue());
    }
}
