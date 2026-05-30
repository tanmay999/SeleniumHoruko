package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class MultipleWindowPage extends BasePage {

    private final By clickHereLink = By.linkText("Click Here");
    private final By newWindowHandling =By.tagName("h3");

    public void navigate(){
        openUrl(PropertiesReader.readKey("base_url")+"windows");
    }

    public void clickOpenNewWindow(){
        clickElement(clickHereLink);
    }

    public void switchToNewWindow(){
        String original =getDriver().getWindowHandle();
        for(String handle : getDriver().getWindowHandles()){
            if(!handle.equals(original)){
                getDriver().switchTo().window(handle);
            }
        }
    }




    public int getWindowCount(){
        return  getDriver().getWindowHandles().size();
    }


    public void CloseCurrentWindowAndSwitch(){
        getDriver().close();
        List<String> handles = new ArrayList<>((getDriver().getWindowHandles()));
        getDriver().switchTo().window(handles.get(0));
    }
}
